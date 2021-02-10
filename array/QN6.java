import java.util.*;


public class QN6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("enter array element");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Printing Original array: ");
        for (int elem : array) {
            System.out.print(elem + " ");
        }

        int[] array2 = new int[array.length];
        System.out.print("\nCopied array=");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[i];
            System.out.print(array2[i] + " ");
        }

        sc.close();

    }

}
