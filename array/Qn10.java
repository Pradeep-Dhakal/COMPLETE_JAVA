import java.util.*;

public class Qn10 {
    public static int reverse(int[] intArray) {
        System.out.println("\n array after reversing:");
        for (int i = intArray.length - 1; i >= 0; i--)

            System.out.print(+intArray[i] + " ");
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array  more than 1");
        int size = sc.nextInt();
        System.out.println("enter the element of array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enterd array elements are ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        reverse(arr);
        sc.close();

    }
}
