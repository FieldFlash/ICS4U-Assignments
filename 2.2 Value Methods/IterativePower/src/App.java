import java.util.Scanner;   // Import the Scanner class

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a base number: ");
        int base = scanner.nextInt();  // Read base
        System.out.println("Enter an exponent: ");
        int exponent = scanner.nextInt();  // Read exponent
        System.out.println("The result is: " + iterativePower(base, exponent));
        scanner.close();
    }
public static int iterativePower(int base, int exponent) {
    int result = 1;
    for (int i = 0; i < exponent; i++) {
        result *= base;
    }
    return result;
    }
}
