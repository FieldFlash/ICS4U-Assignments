import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        clear();
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        DynamicQueue<String> DyQueue = new DynamicQueue<>();
        
        boolean newNames = true;
        String holderName;
        int potatoPasses;

        while (newNames){
            System.out.print("Enter a name (or nothing to continue): ");
            holderName = input.nextLine();
            if (holderName == ""){
                newNames = false;
            } else {
                DyQueue.enqueue(holderName);
            }
        }
        System.out.println("Lets go!");
        Thread.sleep(2000);

        while (DyQueue.size() > 1){
            potatoPasses = rand.nextInt(10) + 1;
            System.out.println("Pass the potato " + potatoPasses + " times!");
            Thread.sleep(2000);
            for (int i = 0; i < potatoPasses; i++){
                DyQueue.enqueue(DyQueue.dequeue());
            }
            System.out.println(DyQueue.dequeue() + " is out!");
            Thread.sleep(2000);
            clear();
        }
        clear();
        System.out.println(DyQueue.dequeue() + " is the winner!");
        
    }

    public static void clear(){
        // clearing the console
        System.out.print("\033[H\033[2J");
    }
}
