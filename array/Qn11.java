import java.util.Scanner;

public class Qn11 {
    public static int remove_element(int[] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if ((number[i] == number[j]) && (i != j)) {
                    System.out.print("\n Duplicate element are element: " + number[j]);
                }

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = sc.nextInt();
        System.out.println("enter the element of array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered array elements are ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        remove_element(arr);
        sc.close();
    }
}
