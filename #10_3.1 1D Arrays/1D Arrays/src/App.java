import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int index = 0;
        boolean found = false;
        String[] friends = new String[5];
        
        for (int i = 0; i < friends.length; i++) {
            friends[i] = input.nextLine();
        }
        System.out.println("\nEnter a name");
        String name = input.nextLine();

        for (int i = 0; i < friends.length; i++) {
            if (name.equalsIgnoreCase(friends[i])) {
                found = true;
                index = i;
                break;
            }  
        }
        if (found) {
            System.out.println("Name exists in list 'friends' at index " + index);
        } else {
            System.out.println("Name does not exist in list 'friends'");
        }

        
        
        
        
        System.out.println("\nList of friends in reverse order:");
        for (int i = 5; i > 0; i--) {
            System.out.println(friends[i-1]);
        }
    }
}
