import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter another number: ");
        int b = input.nextInt();
        System.out.printf("Is %d a multiple of %d?  %b.\n", b, a, isMultiple(a, b));
        input.close();
    }
    public static boolean isMultiple(int a, int b) {
        return a % b == 0;
    }
}