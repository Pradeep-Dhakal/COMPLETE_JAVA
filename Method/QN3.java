import java.util.Scanner;
class AverageNumber{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first, second and third number");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        sc.close();
        int avg=averagenum(number1, number2, number3);
        System.out.println("the average number among this is :" +avg);




    }
    static int averagenum(int a, int b, int c){
        
        return (a+b+c)/3;

    }
}