import java.util.Scanner;
class MthodSum{
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first and second number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = result(a, b);
        sc.close();
        System.out.println("the sum of two number is= " +sum);    
        
    }
    static int result(int num1, int num2){
        int result =num1+num2;
        return result;
       
    }
}