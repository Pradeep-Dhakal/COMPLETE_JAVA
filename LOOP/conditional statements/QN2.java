//1.	Write a program that checks if the number input by user is odd or even and display message accordingly
import java.util.Scanner;
class oddEven {
    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);

        System.out.println("Enter a number to check...");
        int Num=SC.nextInt();
        SC.close();

        if(Num%2==0){
            System.out.println(Num+" is even number");

        }else{
            System.out.println(Num+" is odd number");
        }
    
    }
}
