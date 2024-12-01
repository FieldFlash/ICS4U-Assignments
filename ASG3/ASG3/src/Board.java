public class Board {
    private String color;
    
    String ANSI_RESET = "\u001B[0m";
    String ANSI_RED = "\u001B[31m";

    String board[][] = new String[5][6];

    public Board() {
        color = "red";
        // Initialize the board with empty spaces
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                board[i][j] = " ";
            }
        }
    }
    
    public void drawBoard() {
        System.out.println(ANSI_RED + "        Connect Four" + ANSI_RESET);
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
    }

    public void dropTile() {

    }
}
