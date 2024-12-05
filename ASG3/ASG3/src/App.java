
// Import scanner 
import java.util.Scanner;

// Main class
public class App {
    // Main function
    public static void main(String[] args) throws Exception {
        // Clear screen to cleanup input for a nice polish
        //clearScreen();

        // Creating new scanner object ("I was getting warnings without the try")
        try (Scanner input = new Scanner(System.in)) {
            
            // Instantiate the board
            Board board = new Board();

            // Draw board and prompt to begin
            board.drawBoard();
            System.out.println("press enter to begin");
            input.nextLine();

            // Game loop, each user gets a turn and it checks for a win
            while (true) {
                clearScreen();
                board.drawBoard();
                System.out.println("Player 1, choose a column: ");
                while (true) {
                    try {
                        int column = input.nextInt();
                        board.dropTile(1, column);
                    } catch (Exception e) {
                        System.out.println("place in bounds 1-6 (no letters)");
                        Thread.sleep(2000);
                        clearScreen();
                        board.drawBoard();
                    }
                    break;
                }
                board.checkWin();
                clearScreen();
                board.drawBoard();
                System.out.println("Player 2, choose a column: ");
                while (true) {
                    try {
                        int column = input.nextInt();
                        board.dropTile(2, column);
                    } catch (Exception e) {
                        System.out.println("place in bounds 1-6 (no letters)");
                        Thread.sleep(2000);
                        clearScreen();
                        board.drawBoard();
                    }
                    break;
                }
                board.checkWin();
            }
        } catch (Exception e) {
            System.out.println("Scanner not instantiated");
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
