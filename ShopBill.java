import java.util.Scanner;   // Import Scanner class for user input

public class ShopBill {

    public static void main(String[] args){

        // Create Scanner object to read input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare a constant for the discount rate (10%)
        final double DISCOUNT = 0.10 ;

        // Declare variables to store item prices, total amount,
        // discount amount, and final amount
        double item1, item2, item3, total, final_amount, discount_amount;

        // Ask the user to enter the price of item 1
        System.out.print("Price of item 1: ");

        // Read the price of item 1
        item1 = input.nextDouble();

        // Ask the user to enter the price of item 2
        System.out.print("Price of item 2: ");

        // Read the price of item 2
        item2 = input.nextDouble();

        // Ask the user to enter the price of item 3
        System.out.print("Price of item 3: ");

        // Read the price of item 3
        item3 = input.nextDouble();

        // Calculate the total cost of all items
        total = item1 + item2 + item3 ;

        // Display the total amount
        System.out.println("Total =" + total);

        // Calculate the discount amount
        discount_amount = total * DISCOUNT ;

        // Display the discount amount
        System.out.println("Discount = " + discount_amount);

        // Calculate the final amount after discount
        final_amount = total - discount_amount ;

        // Display the final bill amount
        System.out.println("Final Amount = " + final_amount);

    }
}