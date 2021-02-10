
import java.util.*;

public class QN23 {
    public static void Find(int size, int no) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int a[] = new int[size];
        System.out.println("enter array elements::");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (a[i] == no) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("element found...." + count + "times");
        } else {
            System.out.println("element not found....");
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter size::");
        int size = sc1.nextInt();
        System.out.println("enter no::");
        int no = sc1.nextInt();
        Find(size, no);
        sc1.close();
       
    }
}