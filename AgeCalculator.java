import java.util.Scanner;   // Import Scanner class for user input

public class AgeCalculator{

    public static void main(String[] args){

        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables to store age, current year, and birth year
        int age, current_year, birth_year;

        // Ask the user to enter the current year
        System.out.print("Enter the current Year: ");

        // Read the current year entered by the user
        current_year = input.nextInt();

        // Ask the user to enter the birth year
        System.out.print("Enter the birth year: ");

        // Read the birth year entered by the user
        birth_year = input.nextInt();

        // Calculate age by subtracting birth year from current year
        age = current_year - birth_year;

        // Display the calculated age
        System.out.println("Age = " + age);
    }
}