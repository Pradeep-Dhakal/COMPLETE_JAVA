import java.util.Scanner;
class QuadraticEqn {
		public static void main(String[] args){
			
			Scanner sc= new Scanner(System.in);
			
			double root1, root2, imaginary; 
			sc = new Scanner(System.in);
			
			System.out.print("Enter the Values of a: ");
			double a = sc.nextDouble();	
			
			System.out.print("Enter the Values of b: ");
			double b = sc.nextDouble();
			
			System.out.print("Enter the Values of c: ");
			double c = sc.nextDouble();
			
			double discriminant = (b * b) - (4 * a *c);
		  	
			if(discriminant > 0)
		  	{
		  		root1 = (-b + Math.sqrt(discriminant) / (2 * a));
		  		root2 = (-b - Math.sqrt(discriminant) / (2 * a));
System.out.println("Two Distinct Real Roots Exists: root1 = " + root1 + " and root2 = " + root2);
		  	}
		  	
		  	else if(discriminant == 0)
		  	{
		  		root1 = root2 = -b / (2 * a);
System.out.println("Two Equal and Real Roots Exists: root1 = " + root1 + " and root2 = " + root2);
		  	}
		  	
		  	else if(discriminant < 0)
		  	{
		  		root1 = root2 = -b / (2 * a);
		  		imaginary = Math.sqrt(-discriminant) / (2 * a);
System.out.println("Two Distinct Complex Roots Exists: root1 = " + root1 + " + " + imaginary + " and root2 = " + root2 +" - " +imaginary);
		  	}		
		}
	}

