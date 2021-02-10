import java.util.Scanner;
class ReverseNumber {
	public static void main(String[] args)
	{	
		
		int rev=0, rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number");
		int n = sc.nextInt();
		while(n!=0)
		{
			rem = n%10;
			rev = rev*10+ rem;
			n= n/10;
			
		}
		
		System.out.println("The reversed number is "+rev);
		
		
	}

}
