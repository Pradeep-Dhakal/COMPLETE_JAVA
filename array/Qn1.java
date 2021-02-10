import java.util.Scanner;

class ArrayElement {
    static void Element(int[] array, int a_Size) {
       
        System.out.println("Entered array element are :");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the arry element");
        for (int i = 0; i <n; i++) {
        a[i]=sc.nextInt();
        }
        Element(a, n);
        // System.out.println("Entered array element are :");
        // for(int elem: a){
        // System.out.print(elem + " ");
        // }
        sc.close();

    }

}