/**
 * Name: Liam Shelston
 * Date: 2024-12-07
 * Description: represents the game board for connect four as well as the game logic
 */

package main;

public class Board {    
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_YELLOW = "\u001B[33m";
    final String ANSI_BLUE = "\u001B[34m";

    private String board[][] = new String[5][6];

    /**
     * initializes the board with empty spaces
     */
    public Board() {
        // Initialize the board with empty spaces
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                board[i][j] = " ";
            }
        }
    }
    
    /**
     * draws the game board
     */
    public void drawBoard() {
        System.out.println(ANSI_RED + "        Connect Four" + ANSI_RESET);
        System.out.print(ANSI_BLUE);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0) {
                    System.out.print((i + 1));
                }
                System.out.print(" | " + board[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("____________________________");
        System.out.println("    1   2   3   4   5   6");
        System.out.print(ANSI_RESET);

    }

    /**
     * drops a tile for the player in the specified column
     * @param player the player number (1 or 2)
     * @param column the column number (1 to 6)
     * @return true if the tile was successfully dropped, false if the column is full
     */
    public boolean dropTile(int player, int column) {
        column--;
        for (int i = 4; i >= 0; i--) {
            if (board[i][column].equals(" ")) {
                if (player == 1) {
                    board[i][column] = ANSI_RED + "X" + ANSI_BLUE;
                } else {
                    board[i][column] = ANSI_YELLOW + "O" + ANSI_BLUE;
                }
                return true;
            }
        }
        return false; // Column is full
    }

    /**
     * checks if there is a winning move on the board
     */
    public void checkWin(){
        // horizontal wins
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(board[i][j + 1]) && board[i][j].equals(board[i][j + 2]) && board[i][j].equals(board[i][j + 3]) && !board[i][j].equals(" ")) {
                    App.clearScreen();
                    drawBoard();
                    System.out.println("Player " + board[i][j] + " wins!");
                    System.exit(0);
                }
            }
        }
        // vertical wins
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                if (board[i][j].equals(board[i + 1][j]) && board[i][j].equals(board[i + 2][j]) && board[i][j].equals(board[i + 3][j]) && !board[i][j].equals(" ")) {
                    App.clearScreen();
                    drawBoard();
                    System.out.println("Player " + board[i][j] + " wins!");
                    System.exit(0);
                }
            }
        }
        // diagonal wins
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(board[i + 1][j + 1]) && board[i][j].equals(board[i + 2][j + 2]) && board[i][j].equals(board[i + 3][j + 3]) && !board[i][j].equals(" ")) {
                    App.clearScreen();
                    drawBoard();
                    System.out.println("Player " + board[i][j] + " wins!");
                    System.exit(0);
                }
            }
        }
        // diagonal wins in other directions
        for (int i = 0; i < 2; i++) {
            for (int j = 3; j < 6; j++) {
                if (board[i][j].equals(board[i + 1][j - 1]) && board[i][j].equals(board[i + 2][j - 2]) && board[i][j].equals(board[i + 3][j - 3]) && !board[i][j].equals(" ")) {
                    App.clearScreen();
                    drawBoard();
                    System.out.println("Player " + board[i][j] + " wins!");
                    System.exit(0);
                }
            }
        }
    }

    /**
     * gets a smart move for the ai to block player 1 from winning
     * @return the column number for the smart move
     */
    public int getSmartMove() {
        // simple ai that blocks player 1 from winning
        for (int col = 1; col <= 6; col++) {
            if (winNextMove(1, col)) {
                return col;
            }
        }
        // if no blocking move is found, choose the first available column
        for (int col = 1; col <= 6; col++) {
            if (isColumnAvailable(col)) {
                return col;
            }
        }
        return 1; // fall back to the first column if all are full
    }

    /**
     * checks if the next move in the specified column will result in a win
     * @param player the player number (1 or 2)
     * @param column the column number (1 to 6)
     * @return true if the move results in a win, false otherwise
     */
    private boolean winNextMove(int player, int column) {
        // drop a tile in the column and check for a win without drawing

        // cycle through all the rows in the column specified and check if the move is winning
        for (int i = 4; i >= 0; i--) {
            if (board[i][column - 1].equals(" ")) {
                board[i][column - 1] = (player == 1) ? ANSI_RED + "X" + ANSI_BLUE : ANSI_YELLOW + "O" + ANSI_BLUE;
                boolean win = checkPotentialWin();
                // undo the move once checked
                board[i][column - 1] = " "; 
                return win;
            }
        }
        return false;
    }

    /**
     * checks for potential winning moves on the board
     * @return true if there is a potential win, false otherwise
     */
    private boolean checkPotentialWin() {
        // check for potential wins
        // horizontal wins
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(board[i][j + 1]) && board[i][j].equals(board[i][j + 2]) && board[i][j].equals(board[i][j + 3]) && !board[i][j].equals(" ")) {
                    return true;
                }
            }
        }
        // vertical wins
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                if (board[i][j].equals(board[i + 1][j]) && board[i][j].equals(board[i + 2][j]) && board[i][j].equals(board[i + 3][j]) && !board[i][j].equals(" ")) {
                    return true;
                }
            }
        }
        // diagonal wins
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(board[i + 1][j + 1]) && board[i][j].equals(board[i + 2][j + 2]) && board[i][j].equals(board[i + 3][j + 3]) && !board[i][j].equals(" ")) {
                    return true;
                }
            }
        }
        // also diagonal wins
        for (int i = 0; i < 2; i++) {
            for (int j = 3; j < 6; j++) {
                if (board[i][j].equals(board[i + 1][j - 1]) && board[i][j].equals(board[i + 2][j - 2]) && board[i][j].equals(board[i + 3][j - 3]) && !board[i][j].equals(" ")) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * checks if the specified column is available for a move
     * @param column the column number (1 to 6)
     * @return true if the column is available, false otherwise
     */
    private boolean isColumnAvailable(int column) {
        return board[0][column - 1].equals(" ");
    }
}