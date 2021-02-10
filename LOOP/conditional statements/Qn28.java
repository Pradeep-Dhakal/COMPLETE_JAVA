import java.util.Scanner;
class TLeapYear {
	public static void main(String[] args)
	{
		Scanner sca= new Scanner(System.in);
		System.out.println("enter a year");
		int year = sca.nextInt();
		
		String result = (year%400==0)||(year%100!=0) && (year%4==0)? "Leap year" : "Not Leap Year" ;
		
		System.out.println(year+ " is "+result);
	}

}
