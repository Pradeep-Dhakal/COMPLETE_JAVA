import java.util.*;

public class QN5 {
    public static void RemoveElement(int[] arr, int RemoveINdex) {
        
        for (int i = RemoveINdex; i < arr.length - 1; i++) {
            if(arr[i]==RemoveINdex){
               arr[i] =arr[i]-RemoveINdex;
            }
                System.out.println("array efter removing " + RemoveINdex + " is: " + arr);
           
        }
    
    

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
        System.out.println("\nenter which index thet you want remove");
        int num = sc.nextInt();
        RemoveElement(array, num);
        sc.close();
    }

}
