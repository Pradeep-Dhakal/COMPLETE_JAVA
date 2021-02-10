import java.util.Arrays;
import java.util.Scanner;

class solution {
    public static int[] findArray(int[] nums) {
        int n = nums.length;

        int[] left_element = new int[n];
        int[] right_element = new int[n];

        left_element[0] = 1;
        for (int i = 1; i < n; i++) {
            left_element[i] = nums[i - 1] * left_element[i - 1];
        }

        right_element[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            right_element[j] = nums[j + 1] * right_element[j + 1];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = left_element[i] * right_element[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of both array: ");
        int size = sc.nextInt();
        int[] nums1 = new int[size];
        int nums2[] = new int[size];
        System.out.println("Enter first array element:" );
        for (int i = 0; i < size; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter first array element:" );
        for (int i = 0; i < size; i++) {
            nums2[i] = sc.nextInt();
        }

        System.out.println("Original array:\n" + Arrays.toString(nums1));
        int[] result1 = findArray(nums1);
        System.out.println("Array with product of every other element:\n" + Arrays.toString(result1));
        
        System.out.println("\nOriginal array:\n" + Arrays.toString(nums2));
        int[] result2 = findArray(nums2);
        System.out.println("Array with product of every other element:\n" + Arrays.toString(result2));

    }
}
