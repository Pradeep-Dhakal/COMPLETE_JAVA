
import java.util.Scanner;
class UpperToLower {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		
		char ch= sc.next().charAt(0);
		
		if(ch>='a' && ch<='z' )
		{
		System.out.println(Character.toUpperCase(ch));
		}
		
		else if(ch>='A' && ch<='Z')
		{
			System.out.println(Character.toLowerCase(ch));
		}
	}
}

