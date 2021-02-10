
import java.util.*;

class Q24 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 77, 65 };
        System.out.println("Original Array: " + Arrays.toString(num));
        int num1 = 65;
        int num2 = 77;

        System.out.println("Result: " + result(num, num1, num2));
    }

    public static boolean result(int[] num, int num1, int num2) {
        for (int n : num) {
            boolean i = n != num1 && n != num2;
            if (i) {
                return false;
            }
        }
        return true;
    }
}