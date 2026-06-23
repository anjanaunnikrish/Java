import java.util.Scanner;   // Import Scanner class for user input

public class DataCalculator {

    public static void main(String[] args){

        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare a constant for the total data limit (30 GB)
        final double DATA_LIMIT = 30.0 ;

        // Declare variables to store data used and remaining data
        double data_used, data_remain ;

        // Ask the user to enter the amount of data used
        System.out.print("Enter the data used in GB : " );

        // Read the data used entered by the user
        data_used = input.nextDouble();

        if (data_used > DATA_LIMIT){
            System.out.println("No suffient data");
        }
        else {
            // Calculate the remaining data
            data_remain = DATA_LIMIT - data_used;
            // Display the remaining data in GB
            System.out.println("Remaining data in GB = " + data_remain);
        }


    }
}