import java.util.Arrays;
import java.util.Scanner;
public class Qn31 {
    static int[] rearrange(int[] new_arra, int n) {
        int temp[] = new int[n];

        int small_num = 0, large_num = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag)
                temp[i] = new_arra[large_num--];
            else
                temp[i] = new_arra[small_num++];

            flag = !flag;
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter total size of elements: ");
        int size=SC.nextInt();
       
        int nums[] = new int[size];
        int result[];
        System.out.println("Enter  elements: ");
        for(int i=0; i<size; i++){
            nums[i]=SC.nextInt();
        }

        System.out.println("Original Array ");
        System.out.println(Arrays.toString(nums));

        result = rearrange(nums, nums.length);

        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));
        SC.close();
    }
}