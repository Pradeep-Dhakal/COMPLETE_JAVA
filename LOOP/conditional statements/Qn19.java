import java.util.Scanner;
class Attendance {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of class held");
		double days = sc.nextInt();
		
		System.out.println("enter the number of class attended");
		double attend = sc.nextInt();
		
		double percentage = (attend/days)*100;
	
		System.out.println("you total attendance is " +percentage+ "%");
		
		if(percentage<=75)
		{
			System.out.println("you are NOT allowed to attend exam");
		}
		
		else {
			System.out.println("you are allowed to attend exam");
		}
		
		}

}

