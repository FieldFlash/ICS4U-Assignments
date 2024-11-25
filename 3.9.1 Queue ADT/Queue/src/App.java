import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String command;
        Scanner keyInput = new Scanner(System.in);
        // Define a static stack with a fixed size of 3.
        StaticQueue<Integer> myQueue = new StaticQueue<>(3);
        
        while (true) {
            System.out.printf( "\nStack Empty? %b   Stack Size? %d   %s\n", myQueue.isEmpty(), myQueue.size(), myQueue );
            System.out.print( "Command >" );
            command = keyInput.nextLine().toLowerCase().trim();
            if ( command.startsWith( "queue" ) ) {
                System.out.print("Enter value to queue");
                int value = keyInput.nextInt();
                myQueue.enqueue(value);
                System.out.println( "Queued: " + value );
            }
            else if ( command.startsWith( "dequeue" ) ) {
                System.out.println( "dequeued: " + myQueue.dequeue());
            }
            else if ( command.startsWith( "peek" ) ) {
                System.out.println( "Peeked: " + myQueue.peek() );
            }
            else if ( command.startsWith( "clear" ) ) {
                myQueue.clear();
                System.out.println( "Cleared!" );
            }
            else if ( command.startsWith( "quit" ) ) {
                System.out.println( "Bye-Bye!");
                break;
            }
            else {
                System.out.println( "I don't understand \""+command+"\".  Please use: push #, pop, peek, clear, or quit" );
            }
        }
    }
}
