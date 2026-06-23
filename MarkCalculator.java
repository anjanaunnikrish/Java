import java.util.Scanner;

public class MarkCalculator {
    public static void main(String[] args){
        Scanner mark = new Scanner(System.in);

        System.out.print("Enter the mark1: ");
        int mark1 = mark.nextInt();

        System.out.print("Enter the mark2: ");
        int mark2 = mark.nextInt();

        System.out.print("Enter the mark3: ");
        int mark3 = mark.nextInt();

        int Total = mark1 + mark2 + mark3;
        System.out.println("Total = " + Total);

        int average = Total / 3 ;
        System.out.println("Average = " + average);

        if (average >= 50) {
            System.out.println("Above average");
        }
        else {
            System.out.println("Below Average");
        }

    }
}
