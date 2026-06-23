import java.util.Scanner;   // Import Scanner class for user input

public class RestaurantBill {

    public static void main(String[] args){

        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare constant values for GST and Service Charge rates
        final double GST = 0.05;
        final double SERVICE_CHARGE = 0.1;

        // Ask the user to enter the food cost
        System.out.print("Enter the food cost : ");

        // Read the food cost entered by the user
        double cost = input.nextDouble();

        // Calculate GST amount
        double gst_charge = GST * cost ;

        // Display GST amount
        System.out.println("GST = " + gst_charge);

        // Calculate Service Charge amount
        double charge = SERVICE_CHARGE * cost ;

        // Display Service Charge amount
        System.out.println("Service Charge =" + charge);

        // Calculate the final bill amount
        double total = cost + gst_charge + charge;

        // Display the final bill amount
        System.out.println("Final Bill = " + total);
    }
}