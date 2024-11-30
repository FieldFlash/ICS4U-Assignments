import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
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
        System.out.print("How many potato passes do you want to have?: ");
        potatoPasses = input.nextInt();
        System.out.println("Lets go!");
        Thread.sleep(2000);
        System.out.println("e");
        
    }
}
