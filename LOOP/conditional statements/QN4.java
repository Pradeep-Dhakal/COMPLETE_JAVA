/* 4.	Write a program that checks if the number input by user is both 
even and divisible by 5 or not and display message accordingly. 
*/

import java.util.Scanner;
    class DivisibleAndEven{
    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);
        System.out.println("enter a number");
		int num = SC.nextInt();

		
		if(num%2==0 && num%5==0)
		{
			System.out.println(num + " is even & divisible by 5");
		}
		
		else if(num%2!=0 && num%5==0) {
			System.out.println(num + " is NOT even & but divisible by 5");
		}
		
		else if(num%2==0 && num%5!=0)
		{
			System.out.println(num + " is even but NOT divisible by 5");
		}
		
		else
		{
			System.out.println(num + " is NOT even & not divisible by 5");
		}
		
	}
}

