import java.util.Scanner;
 class Area {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 'R for rectangle \n      'S' for square \n      'C' for circle :-");
		char ch = sc.next().charAt(0);
		
		if(ch=='R')
		{
			System.out.println("enter the length: ");
			int l= sc.nextInt();
			System.out.println("enter the breadth: ");
			int b = sc.nextInt();
			
			int area = l*b;
			System.out.print("The area of rectangle is " +area);
		}
		
		else if (ch=='S')
		{
			System.out.println("enter the side of square: ");
			int side =  sc.nextInt();
			int area = side*side;
			System.out.print("The area of square is "+area);
		}
		
		else if(ch=='C')
		{
			System.out.println("enter the radius of circle: ");
			int r = sc.nextInt();
			
			double area = 3.14 *r*r;
			System.out.print("Area of circle is "+area);
		}
		
		else {
			System.out.print("Invalid Entry");
		}
			
	
	}
}

