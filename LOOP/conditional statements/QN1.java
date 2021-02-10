//1 Write a program that takes two numbers as input from users and print the largest among them.

import java.util.Scanner;
    class great{
        public static void main(String[] args){
        Scanner SC=new Scanner(System.in);

        System.out.println("enter first and second number");
        int A=SC.nextInt();
        int B=SC.nextInt();
        SC.close();

        if(A>B){
            System.out.println(+A+" is greater number" );
        }else{
            System.out.println(+B+" is greater number");
        }
    

        }
    }