import java.text.DecimalFormat;
import java.util.Scanner;
class NepaliFormatconverter {	
	public static void nepaliformat(int num) {
		Scanner sc=new Scanner(System.in);
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
		
		//for comma (,)
		String newnumber="";
		String newnumberlast="";
		String nepaliformat1="";
		String front="";
		System.out.println("Enter amount");

		if(nepalinumber.length()<3||nepalinumber.length()==3) {
			System.out.println("The Neplai format is: "+nepalinumber);
		}
		else {
			String numstring1=String.valueOf(num);
			for(int i=0;i<(nepalinumber.length()-3);i++) {
				newnumber=newnumber+nepalinumber.charAt(i);
			}
		
			for(int i=(nepalinumber.length()-3);i<nepalinumber.length();i++) {
				newnumberlast=newnumberlast+nepalinumber.charAt(i);
			}		
			int num1=Integer.valueOf(newnumber);
			DecimalFormat formatter=new DecimalFormat("#,##");
			nepaliformat1=(formatter.format(num1));
			front=String.valueOf(nepaliformat1);			
		}
		String nepalinumber1="";
		for(int i=0;i<front.length();i++) {
			if(front.charAt(i)=='0') {
				nepalinumber1=nepalinumber1+'0';
			}
			if(front.charAt(i)=='1') {
				nepalinumber1=nepalinumber1+one;
			}
			if(front.charAt(i)=='2') {
				nepalinumber1=nepalinumber1+two;
			}
			if(front.charAt(i)=='3') {
				nepalinumber1=nepalinumber1+three;
			}
			if(front.charAt(i)=='4') {
				nepalinumber1=nepalinumber1+four;
			}
			if(front.charAt(i)=='5') {
				nepalinumber1=nepalinumber1+five;
			}
			if(front.charAt(i)=='6') {
				nepalinumber1=nepalinumber1+six;
			}
			if(front.charAt(i)=='7') {
				nepalinumber1=nepalinumber1+seven;
			}
			if(front.charAt(i)=='8') {
				nepalinumber1=nepalinumber1+eight;
			}
			if(front.charAt(i)=='9') {
				nepalinumber1=nepalinumber1+nine;
			}
			if(front.charAt(i)==',') {
				nepalinumber1=nepalinumber1+',';
		}
		}	 
		System.out.println(nepalinumber1+","+newnumberlast);
	}
	public static void englishformat(int num) {
		DecimalFormat formatter=new DecimalFormat("#,###");
		String englishformat=formatter.format(num);
		System.out.println("The English format is: "+englishformat);
	}	
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		number=sc.nextInt();
		int choose;
		System.out.println("Choose\n 1:Nepali \n2:English ");
		choose=sc.nextInt();
		switch(choose) {
		case 1:
			nepaliformat(number);
			break;
		case 2:
			englishformat(number);
			break;		
		}
	}
}
