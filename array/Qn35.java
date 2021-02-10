import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Qn35 {
    public static void shuffle(int nums[]) {
        for (int i = nums.length - 1; i >= 1; i--) {
            Random rand = new Random();

            int j = rand.nextInt(i + 1);

            swap_elements(nums, i, j);
        }
    }

    private static void swap_elements(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int nums[]=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0; i<size;i++){
        nums[i] = sc.nextInt();
    }
        System.out.println("Original Array: "+Arrays.toString(nums));
		shuffle(nums);
        System.out.println("Shuffle Array: "+Arrays.toString(nums));
        sc.close();
	}
}
