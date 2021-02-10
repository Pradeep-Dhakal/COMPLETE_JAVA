//3.Write a program that checks if the number input by user is divisible by 5 or not and display message accordingly
import java.util.Scanner;
    class Divisible{
    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);

        System.out.println("Enter a number to check...");
        int Num=SC.nextInt();
        SC.close();

        if(Num%5==0){
            System.out.println(Num+" is divisible by 5");

        }else{
            System.out.println(Num+" is not divisibe by 5");
        }
    
    }
}