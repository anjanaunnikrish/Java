import java.util.Scanner;   // Import Scanner class for user input

public class SalaryCalculator {

    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare constant rates for DA and HRA
        final double DA_RATE = 0.20;   // 20% Dearness Allowance
        final double HRA_RATE = 0.10;  // 10% House Rent Allowance

        // Ask the user to enter the basic salary
        System.out.print("Enter the basic salary: ");

        // Read the basic salary from the user
        double basic = input.nextDouble();

        // Calculate Dearness Allowance (DA)
        double DA = DA_RATE * basic;

        // Display DA
        System.out.println("DA = " + DA);

        // Calculate House Rent Allowance (HRA)
        double HRA = HRA_RATE * basic;

        // Display HRA
        System.out.println("HRA = " + HRA);

        // Calculate Gross Salary
        double gross_salary = basic + DA + HRA;

        // Display Gross Salary
        System.out.println("Gross Salary = " + gross_salary);


    }
}