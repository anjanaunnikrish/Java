import java.util.Scanner;

public class CountOfEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i=0 ; i<n;i++){
            System.out.print("Enter the number "+(i+1)+" : ");
            nums[i] = sc.nextInt();
        }

        int count = 0;

        for (int i=0 ; i<n;i++){
            if (nums[i] %2 == 0){
                count ++;
            }
        }

        System.out.print("Number of even numbers in the array : "+count);

    }
}
