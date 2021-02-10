  
 import java.util.Scanner; 
class Qn12 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a digit or a letter");
		char ch = sc.next().charAt(0);
		
		if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))
		{
			System.out.println( ch+ " is an letter");
		}
		
		else if(ch>='0' && ch<='9')
		{
			System.out.println( ch+ " is an digit");
		}
		
		else
		{
			System.out.println(ch+ " is a special symbol");
		}

	}
}
