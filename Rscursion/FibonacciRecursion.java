import java.util.Scanner;
public class FibonacciRecursion{
public static int fibonacci(int n){
  if( n == 0 || n == 1)
    return n;
  else
    return (fibonacci(n - 1) + fibonacci(n - 2));
}
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");
        int nummer= sc.nextInt();
        System.out.println("Last fibonacci sequence: "+fibonacci(nummer));
        sc.close();
    }
}