import java.util.*;

public class QN9 {
    public static int ManMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max) {
                max = array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        int diff=max-min;
        System.out.println("\n the maximum value among them is: " + max);
        System.out.println("the minimum value among them is: " + min);
        System.out.println(" the  different between maximum and minimum value is: " + diff);
        return diff;
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
        ManMin(arr);
        sc.close();
    }

}