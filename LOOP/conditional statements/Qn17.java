import java.util.Scanner;
public class Qn17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        sc.close();

if(num<0){
    num=num*(-1);
    System.out.println("absolute value of given number is " +num);
}else{
    System.out.println("absolute value of given number is "+num);
}

    }  
}
