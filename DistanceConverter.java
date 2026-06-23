import java.util.Scanner;   // Import Scanner class for user input

public class DistanceConverter {

    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Ask the user to enter distance in kilometres
        System.out.print("Enter the distance in kilometres: ");

        // Read the distance entered by the user
        double kilometers = input.nextDouble();

        // Convert kilometres to meters
        double meters = kilometers * 1000;

        // Display the distance in meters
        System.out.println("Meters = " + meters);

        // Convert meters to centimeters
        double centimeters = meters * 100;

        // Display the distance in centimeters
        System.out.println("Centimeters = " + centimeters);


    }
}