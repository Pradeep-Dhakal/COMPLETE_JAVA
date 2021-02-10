import java.util.*;

public class QN8 {
    public static int maximum(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }

        }
        System.out.println("\n the maximum value among them is: " + max);
        return max;
    }

    public static int minimum(int[] num1) {
        int min = num1[0];
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] < min) {
                min = num1[i];
            }

        }
        System.out.println(" the minimum value among them is: " + min);
        return min;
    }

    public static void main(String[] atgs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elemnt");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("given element are ");
        for (int element : arr) {
            System.out.print(element + " ");

        }
        maximum(arr);
        minimum(arr);
        sc.close();
    }

}
