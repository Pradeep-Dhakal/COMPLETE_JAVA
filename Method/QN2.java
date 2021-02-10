import java.util.Scanner;
class SmallNum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first, second and third number");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        sc.close();
        int min=minimum(number1, number2, number3);
        System.out.println("the minimnum number among this is :" +min);




    }
    static int minimum(int a, int b, int c){
        
        return Math.min(Math.min(a, b), c);

    }
}