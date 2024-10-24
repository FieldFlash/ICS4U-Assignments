import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String longest = "";
        
        int count = 0;

        while (true) {
            System.out.print("Enter a city name (or 'done' to stop): ");
            String city = input.nextLine();
            if (city.equals("done")) {
                break;
            }
            if (city.length() > longest.length()) {
                longest = city.toUpperCase();
            }
            count++;
        }
        input.close();
        System.out.println(count + " names were entered, the longest was " + longest + "!");
    }
}

