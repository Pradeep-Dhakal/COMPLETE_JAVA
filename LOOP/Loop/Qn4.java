import java.util.Scanner;
class sumAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        int num5=sc.nextInt();
        sc.close();

        int sum=num1+num2+num3+num4+num5;
        int average=sum/5;
        System.out.println(" the sum of given number is="+sum+ "\n the average of given number is="+average);
    }
    
}
