import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i=0 ; i<n;i++){
            System.out.print("Enter the number "+(i+1)+" : ");
            nums[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i=0 ; i<n;i++){
            sum += nums[i];
        }

        System.out.print("Sum of elements in the array is : "+sum);
    }
}
