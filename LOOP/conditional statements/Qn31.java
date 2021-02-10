import java.util.Scanner;
 class ValidTriangle {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the 1st side: ");
		int a = sc.nextInt();

		System.out.print("enter the 2nd side: ");
		int b = sc.nextInt();

		System.out.print("enter the 3rd side: \n");
		int c = sc.nextInt();
		
		if((a+b>c) && (a+c>b) && (b+c>a))
		{
			System.out.println("The triangle is valid \n");
			
			if(a==b && b==c)
			{
				System.out.println("Equilateral Triangle");
			}
			
			else if(a==b|| b==c || c==a)
				{
				System.out.println("Isosceles Triangle");
				}
			
			else {
				System.out.println("Scalane Triangle");
			}
				}
		
		else {
			System.out.println("The triangle is NOT valid");
		}
}
}
