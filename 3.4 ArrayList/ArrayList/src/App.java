import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> friends = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            clear();
            System.out.println("menu:");
            System.out.println("1. display friends");
            System.out.println("2. add a friend");
            System.out.println("3. remove friend");
            System.out.println("4. clear friends");
            System.out.println("5. exit");
            System.out.print("enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            clear();

            switch (choice) {
                case 1:
                    if (friends.isEmpty()) {
                        System.out.println("no friends (sad).");
                    } else {
                        System.out.println(friends.toString());
                    }
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.print("enter the name of the friend: ");
                    String newFriend = scanner.nextLine();
                    if (friends.contains(newFriend)) {
                        System.out.println("this friend already exists.");
                    } else {
                        friends.add(newFriend);
                        System.out.println("friend added.");
                    }
                    break;
                case 3:
                    System.out.print("enter the name of the friend to remove: ");
                    String friendToRemove = scanner.nextLine();
                    if (friends.contains(friendToRemove)) {
                        friends.remove(friendToRemove);
                        System.out.println("friend removed.");
                    } else {
                        System.out.println("this friend does not exist.");
                    }
                    break;
                case 4:
                    friends.clear();
                    System.out.println("all friends cleared.");
                case 5:
                    System.out.println("quitting program.");
                    break;
                default:
                    System.out.println("not a valid choice");
            }
        }
        scanner.close();
    }

    public static void clear(){
        // clearing the console
        System.out.print("\033[H\033[2J");
    }

}

