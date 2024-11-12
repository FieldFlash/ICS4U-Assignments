import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[] arr = new int[10];
        int searchKey;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        while (true){
            System.out.println("Enter a number to search for: ");
            searchKey = input.nextInt();
            if (searchKey == -1) {
                break;
            } else{
                System.out.println(iterativeBinarySearch(arr, searchKey));
            }
        }
        input.close();

    }

    public static String iterativeBinarySearch(int[] arr, int searchKey) {
        // iterative binary search
        int low = 0;
        int high = arr.length - 1;
        int middle;

        while (low <= high) {
            middle = (low + high) / 2;

            if (arr[middle] == searchKey) {
                return "number found at index " + middle;
            } else if (arr[middle] < searchKey) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        } 
        return "Number not found";
    }
}