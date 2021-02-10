import java.util.Scanner;

public class Qn32 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size :\n");
        int size = sc.nextInt();
        System.out.print("Enter the elements of the array :\n");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        findevenAndOdd(arr, size);
    }

    public static void findevenAndOdd(int arr[], int size) {

        System.out.print("Even numbers are: \n");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.print("Odd numbers are: \n");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            }
        }

    }

}