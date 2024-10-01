import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city;
        String longest = "";
        int count = 0;
        do {
            System.out.print("Enter a city name (or 'done' to stop): ");
            city = input.nextLine();
            if (city.length() > longest.length()) {
                longest = city.toUpperCase();
            }
            count++;
        } while (!city.equals("done"));
        System.out.println((count-1)+" names were entered, the longest was "+longest+"!");    }
}

