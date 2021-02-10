import java.util.*;

public class QN17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m:");
        int m = sc.nextInt();
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("Calculated result: " + power(m, n));

        sc.close();
    }

    static int power(int m, int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= m;
        }
        return sum;
    }

    static int power(int m) {
        return (int) Math.pow(m, 2);
    }
}
