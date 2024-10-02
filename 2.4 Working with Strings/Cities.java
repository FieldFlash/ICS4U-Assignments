import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Initialize a variable to store the longest city name
        String longest = "";
        
        // Initialize a counter to count the number of city names entered
        int count = 0;

        // Start an infinite loop to continuously ask for city names
        while (true) {
            // Prompt the user to enter a city name or 'done' to stop
            System.out.print("Enter a city name (or 'done' to stop): ");
            
            // Read the city name entered by the user
            String city = input.nextLine();
            
            // Check if the user entered 'done' to stop the loop
            if (city.equals("done")) {
                break;
            }
            
            // Check if the current city name is longer than the longest one stored
            if (city.length() > longest.length()) {
                // Update the longest city name and convert it to uppercase
                longest = city.toUpperCase();
            }
            
            // Increment the counter for each city name entered
            count++;
        }
        
        // Close the Scanner object
        input.close();
        
        // Print the total number of city names entered and the longest city name
        System.out.println(count + " names were entered, the longest was " + longest + "!");
    }
}

