public class Board {    
    String ANSI_RESET = "\u001B[0m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_BLUE = "\u001B[34m";

    String board[][] = new String[5][6];

    public Board() {
        // Initialize the board with empty spaces
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                board[i][j] = " ";
            }
        }
    }
    
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

    public void dropTile(int player, int column) {
        column--;
        
            for (int i = 4; i >= 0; i--) {
                if (board[i][column].equals(" ")) {
                    if (player == 1) {
                        board[i][column] = ANSI_RED + "X" + ANSI_BLUE;
                    } else {
                        board[i][column] = ANSI_YELLOW + "O" + ANSI_BLUE;
                    }
                    break;
                }  
            }


    }

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
        // also diagonal wins
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
}