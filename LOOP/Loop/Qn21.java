import java.util.Scanner;
 class Decnumb {
               public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		String nepalinumber="";
		char one='१';
		char two='२';
		char three='३';
		char four='४';
		char five='५';
		char six='६';
		char seven='७';
		char eight='८';
		char nine='९';
		
		System.out.println("Enter your value ");
		num=sc.nextInt();
		String numstring=String.valueOf(num);
		for(int i=0;i<numstring.length();i++) {
			if(numstring.charAt(i)=='0') {
				nepalinumber=nepalinumber+'0';
			}
			if(numstring.charAt(i)=='1') {
				nepalinumber=nepalinumber+one;
			}
			if(numstring.charAt(i)=='2') {
				nepalinumber=nepalinumber+two;
			}
			if(numstring.charAt(i)=='3') {
				nepalinumber=nepalinumber+three;
			}
			if(numstring.charAt(i)=='4') {
				nepalinumber=nepalinumber+four;
			}
			if(numstring.charAt(i)=='5') {
				nepalinumber=nepalinumber+five;
			}
			if(numstring.charAt(i)=='6') {
				nepalinumber=nepalinumber+six;
			}
			if(numstring.charAt(i)=='7') {
				nepalinumber=nepalinumber+seven;
			}
			if(numstring.charAt(i)=='8') {
				nepalinumber=nepalinumber+eight;
			}
			if(numstring.charAt(i)=='9') {
				nepalinumber=nepalinumber+nine;
			}
                                   }
		 System.out.println(nepalinumber);
	}
}
