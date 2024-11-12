
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int index = 0;
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        clear();
        System.out.println(Arrays.toString(arr));
        while (true){
            System.out.println("Enter a number to search for: ");
            int num = input.nextInt();
            recursiveLinear(arr, num, index);
        }
    }

    public static int recursiveLinear(int[] arr, int num, int index) {
        if (arr[index] == num) {
            System.out.println("Number found at index: " + index);
            return index;
        } else if (index < arr.length - 1) {
            return recursiveLinear(arr, num, index + 1);
        } else {
            System.out.println("Number not found");
            return -1;
        }
    }
    
    public static void clear(){
        // clearing the console
        System.out.print("\033[H\033[2J");
    }
}
