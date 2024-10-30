import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int i = 0;
        int num = 0;

        while (true) {
            try {
                System.out.print("Enter a number (or -1 to exit): ");
                num = input.nextInt();
                if (num == -1) {
                    System.out.println("Exiting program");
                    input.close();
                    System.out.println("Numbers: " + Arrays.toString(numbers));
                    break;
                }
                numbers[i] = num;
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Resizing array...");
                numbers = new int[numbers.length + 5];
            }
        }
    }
}
