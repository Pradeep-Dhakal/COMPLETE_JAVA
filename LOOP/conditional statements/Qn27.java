import java.util.Scanner;
class TernaryOddAndDivisibleNumber {
	public static void main(String[] args)
	{
		Scanner scs = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scs.nextInt();
		
		String result = (num%2==0) && (num%5==0) ? "Even & Divisible by 5": (num%2==0 && (num%5!=0)? "Even but not divisible by 5": (num%2!=0 && num%5==0)? "Odd but divisible by 5": (num%2!=0 && num%5!=0)? "odd & not divisible by 5": "wrong input");
		
System.out.println(num+ " is " +result);
	
}
}
