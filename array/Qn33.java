import java.util.Arrays;
import java.util.Scanner;

class Qn33 {

    public static void sortNumbers(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[k++] = 0;
            }
        }

        for (int i = k; i < nums.length; i++) {
            nums[k++] = 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter all elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(numbers));
        sortNumbers(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
        sc.close();
    }
}