import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Prompt user for dimensions
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Instantiate the 2D array
        int[][] array = new int[rows][columns];

        // Initialize the array with random integers between 1 and 99
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(99) + 1;
            }
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
                if (array[i][j] > largest) {
                    largest = array[i][j];
                }
                if (array[i][j] < smallest) {
                    smallest = array[i][j];
                }
            }
            System.out.println("\n");
        }

        // Report the largest and smallest integers
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        input.close();
    }
}