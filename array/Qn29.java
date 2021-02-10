import java.util.*;
import java.lang.*;

public class Qn29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of element: ");
        int size= sc.nextInt();
        int nums[] = new int[size];
        int i, nums_size = nums.length;
        System.out.println("Enter array element: ");
        for(i=0; i<size; i++){
            nums[i]=sc.nextInt();
        }
        int left = 0, right = nums_size - 1;

        System.out.println("Original Array : " + Arrays.toString(nums));

        while (left < right) {
            /* While 0 at left increment left index */
            while (nums[left] == 0 && left < right)
                left++;

            /* While we see 1 at right decrement right index */
            while (nums[right] == 1 && left < right)
                right--;

            if (left < right) {
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }

        System.out.println("Array after segregation is : " + Arrays.toString(nums));
    }
}