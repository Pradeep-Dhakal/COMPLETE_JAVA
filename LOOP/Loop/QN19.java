
import java.util.Scanner;
class Roundoff {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.print("enter a number to round of: ");
			double num = sc.nextDouble();
			
			double roundoff = Math.round(num*100.0)/100.0;
			System.out.println(roundoff);
	}

}

