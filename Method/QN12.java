import java.util.Random;
import java.util.Scanner;
class Binary {
public static void main(String[] args)
    {       
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        sc.close();
        matrix(n);
    } 
 public static void matrix(int n) {
     Random r=new Random();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(r.nextInt(2));
            }
            System.out.println();
        }
    }
}
