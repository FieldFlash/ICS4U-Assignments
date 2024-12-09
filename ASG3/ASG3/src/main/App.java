/**
 * Name: Liam Shelston
 * Date: 2024-12-07
 * Description: A simple connect 4 game where the player plays against the computer
 */

package main;

// importing the necessary classes
import java.util.Random;
import java.util.Scanner;

public class App {
    /**
     * main method to start the game
     * @throws Exception if an error occurs
     */
    public static void main(String[] args) throws Exception {
        // instantiate the scanner
        try (Scanner input = new Scanner(System.in)) {
            // create a new board
            Board board = new Board();
            // draw the board
            board.drawBoard();
            System.out.println("press enter to begin");
            input.nextLine();
            // create a random object
            Random random = new Random();

            // game loop
            while (true) {
                clearScreen();
                board.drawBoard();
                // player's turn
                System.out.println("Player 1, choose a column: ");
                // get the player's input and place the tile
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
                // check for win
                board.checkWin();
                clearScreen();
                board.drawBoard();

                // computer's turn
                System.out.println("Computer is thinking...");
                // short delay for fun
                Thread.sleep(2000); 
                int column = board.getSmartMove();
                // places in a random column if the smart move is not possible
                while (!board.dropTile(2, column)) {
                    column = random.nextInt(6) + 1;
                }
                // check for win
                board.checkWin();
            }
        } catch (Exception e) {
            // i have no idea why i get an error without this
            System.out.println("Scanner not instantiated");
        }
    }

    /**
     * clears the console screen
     */
    public static void clearScreen() {
        // refresh the screen without leaving visual clutter above
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
