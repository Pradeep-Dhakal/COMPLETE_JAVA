import java.util.Scanner;

import java.util.Arrays;

public class QN12 {
    public static int CommonElement(int[] ar1, int[] ar2) {
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i] == ar2[j]) {
                    
                    System.out.println("common element in both array is:" + (ar1[i]));
                }
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of both array:");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        System.out.println("Enter the elament of first array: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the element of second array");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Array1 : " + Arrays.toString(arr1));
        System.out.println("Array1 : " + Arrays.toString(arr2));
        CommonElement(arr1, arr2);
        sc.close();
    }

}
