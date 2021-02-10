import java.util.Random;
import java.util.Scanner;
class HighLow {
	public static void main(String[] args) {
		int guessnumber, randomnumber;
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		randomnumber=1+(int) (random.nextDouble() *100);
		System.out.println("you have maximum 10 tries");
		for(int i=0;i<10;i++) {
			System.out.println("Enter your guess number: "+(i+1)+": ");
			guessnumber=sc.nextInt();
			if(guessnumber==randomnumber) {
				System.out.println("Correct after only "+(i+1)+" guesses -\nBrilliant Thank you");
				break;
			}
			if(guessnumber<randomnumber) {
				System.out.println("Hint: Higher");
			}
			else {
				System.out.println("Hint Lower");
			}
		}
	}
}
