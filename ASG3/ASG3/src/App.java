import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        clearScreen();

        Scanner input = new Scanner(System.in);
        Board board = new Board();

        board.drawBoard();
        input.nextLine();
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
