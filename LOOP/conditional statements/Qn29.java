import java.util.Scanner;
 class TeLargestThree {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st number ");
		int num1 = sc.nextInt();
		
		System.out.println("enter the 2nd number ");
		int num2 = sc.nextInt();
		
		System.out.println("enter the 3rd number ");
		int num3 = sc.nextInt();
		
		int check = num1>num2 ? num1 : num2;
		int result = num3>check? num3 : check;
		
		System.out.println(result+" is largest number ");
	}
}

