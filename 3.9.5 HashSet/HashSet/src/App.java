import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> hashSet = new HashSet<>();
        try (Scanner input = new Scanner(System.in)) {
            clear();
            int count = 10;
            while (count > 0) {
                int num = input.nextInt();
                if (hashSet.contains(num)) {
                    System.out.println("Duplicate number found: " + num);
                    count++;
                    continue;
                }
                hashSet.add(num);
                count--;
            }
        }
        clear();
        Object[] arr = hashSet.toArray();
        for (Object element : arr) {
            System.out.println(element);
        }
    }

    public static void clear(){
        // clearing the console
        System.out.print("\033[H\033[2J");
    }
}
