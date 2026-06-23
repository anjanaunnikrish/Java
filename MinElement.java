import java.util.Scanner;

public class MinElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //int[] nums;

        System.out.print("Enter the number of numbers in the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0 ; i < n ; i++){
            System.out.print("Enter the number " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }

        int small_num = nums[0];

        for(int i = 1 ;i < n ;i++){
            if (nums[i] < small_num){
                small_num = nums[i];
            }
        }

        System.out.print("The smallest number is : "+small_num);

    }
}
