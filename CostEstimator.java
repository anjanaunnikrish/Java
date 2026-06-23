import java.util.Scanner;   // Import Scanner class for user input

public class CostEstimator {

    public static void main(String[] args){

        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables to store distance, mileage,
        // petrol price, fuel needed, and total cost
        int distance, mileage, price, fuel_needed, cost;

        // Ask the user to enter the distance in kilometers
        System.out.print("Enter the distance in km: ");

        // Read the distance entered by the user
        distance = input.nextInt();

        // Ask the user to enter the mileage
        System.out.print("Enter the mileage: ");

        // Read the mileage entered by the user
        mileage = input.nextInt();

        // Ask the user to enter the petrol price per litre
        System.out.print("Enter the petrol price: ");

        // Read the petrol price entered by the user
        price = input.nextInt();

        // Calculate the fuel needed
        // Formula: Fuel Needed = Distance / Mileage
        fuel_needed = distance / mileage;

        // Display the fuel needed
        System.out.println("Fuel needed = " + fuel_needed);

        // Calculate the total cost of fuel
        // Formula: Cost = Fuel Needed × Petrol Price
        cost = fuel_needed * price;

        // Display the total cost
        System.out.println("Cost = " + cost);

    }
}