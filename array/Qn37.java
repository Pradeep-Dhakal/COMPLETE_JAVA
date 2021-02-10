import java.util.Scanner;
import java.util.arrays;


public class Qn37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int array[]  = new int[size];
        System.out.println("Enter the array elemets: ");
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        int maxDiff = max - min;
        System.out.println("the maximum deifferent is:=" + maxDiff);
        sc.close();
    }

}
