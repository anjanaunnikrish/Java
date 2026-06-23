import java.util.Scanner;   // Import Scanner class for user input

public class TemperatureConverter {

    public static void main(String[] args){

        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables to store temperature in Celsius and Fahrenheit
        double celsius, fahrenheit;

        // Ask the user to enter temperature in Celsius
        System.out.print("Enter the temperature in celsius: ");

        // Read the Celsius temperature entered by the user
        celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        // Fahrenheit = (Celsius × 9 / 5) + 32
        fahrenheit = (celsius * 9 / 5 ) + 32 ;

        // Display the temperature in Fahrenheit
        System.out.println("Fahrenheit = " + fahrenheit);

    }
}