import java.util.*;

public class QN3 {
    public boolean Test(int[] elem, int num) {
        for (int i = 0; i < elem.length; i++) {
            if (num == elem[i]) {
                System.out.println("it containts ");
                return true;
            }
        }
        System.out.print("it doesnt consist");
        return false;
    }

    public static void main(String[] args) {
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
        System.out.println("\nenter a number that you want to check it exist or not?: ");
        int num = sc.nextInt();
        QN3 q = new QN3();
        q.Test(arr, num);
        sc.close();

    }

}
