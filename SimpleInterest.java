import java.util.Scanner;   // Import Scanner class for user input

public class SimpleInterest {

    public static void main(String[] args){

        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables to store principal amount, interest, time, and simple interest
        double principal, interest, time, simple_interest;

        // Declare a constant for the default rate of interest (5%)
        final double DEFAULT_RATE = 5.0;

        // Ask the user to enter the principal amount
        System.out.print("Enter the principal amount: ");

        // Read the principal amount entered by the user
        principal = input.nextDouble();

        // Ask the user to enter the time period in years
        System.out.print("Enter the time in years: ");

        // Read the time period entered by the user
        time = input.nextDouble();

        // Calculate Simple Interest using the formula
        // Simple Interest = (Principal × Rate × Time) / 100
        simple_interest = (principal * DEFAULT_RATE * time ) / 100 ;

        // Display the calculated Simple Interest
        System.out.println("Simple Interest = " + simple_interest);

    }
}