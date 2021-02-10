import java.util.*;

public class Qn4 {
    public static int FindIndex(int[] arr, int Number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Number) {
                System.out.println("given number is in: " + i+ " index ");
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the siza of array : ");
        int N = sc.nextInt();
        int[] array = new int[N];
        System.out.println("enter array element");
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("entered elements are : ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nenter the element to check its idex");
        int num = sc.nextInt();
        FindIndex(array, num);
        sc.close();
    }

}
