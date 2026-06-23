import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

//constant
        final double rate_per_unit = 7.5 ;

//input from the user
        System.out.print("Enter the units: ");
        int units = input.nextInt();

        //formula for calculating bill amount
        double billAmount = units * rate_per_unit ;
        System.out.println("Electricity bill :" + billAmount);
    }
}