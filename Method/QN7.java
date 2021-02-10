import java.util.Scanner;
class CountSumOFDigit{
  public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int digits = sc.nextInt();
      sc.close();
	  System.out.println("The sum is " + sumDigits(digits));
    }
 public static int sumDigits(long n) {
		int result = 0;		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}		
		return result;
	}	
 }
