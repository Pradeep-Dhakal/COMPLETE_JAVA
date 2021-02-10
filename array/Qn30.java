import java.util.Arrays;
import java.util.Scanner;

class CyclicRotate {
//static int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    static void rotate(int x[]) {
        int X = x[x.length - 1];
        System.out.println(X);
        {
        for (int i = x.length - 1; i > 0; i--) 
            x[i] = x[i - 1];
            x[0] = X;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int num=sc.nextInt();
        int arr[] = new int[num];
        System.out.println("enter elament: ");
        for(int i=0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Given arrays is : ");
        System.out.println(Arrays.toString(arr));
        rotate(arr);
        System.out.println("Rotated array is:");
        System.out.println(Arrays.toString(arr));
        sc.close();

    }

}
