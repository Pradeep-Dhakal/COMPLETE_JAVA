import java.util.Scanner;
class FIB{
public static void main(String[] args){
    int num=0, a=1,b=1;
        Scanner sc=new Scanner(System.in);
         System.out.print("enter any number");
        int n=sc.nextInt();
        sc.close();
        System.out.println("The fibonacci series is");
        System.out.print("1 1 ");
while(num<n){
    num=a+b;
    if(num>=n)
    break;
    System.out.print(num+" ");
    a=b;
    b=num;
    }
  }
} 