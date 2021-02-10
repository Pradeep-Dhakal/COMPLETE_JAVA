import java.util.*;

public class Qn27 {

    public static void leader(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }

                if (j == n - 1)
                    System.out.println(arr[i] + " is a leader");
            }
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = SC.nextInt();
        int array[] = new int[size];
        System.out.println("Enter array element");
        for (int i = 0; i < size; i++) {
            array[i] = SC.nextInt();
        }

        leader(array, size);
        SC.close();
    }
}
