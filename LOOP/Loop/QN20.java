import java.text.DecimalFormat;
import java.util.Scanner;
class nepaliformat1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		String newnumber="";
		String newnumberlast="";
		String nepaliformat1="";
		System.out.println("Enter amount");
		num=sc.nextInt();
		String stringnum=String.valueOf(num);
		if(stringnum.length()<3||stringnum.length()==3) {
			System.out.println("The Neplai format is: "+num);
		}
		else {
			String numstring=String.valueOf(num);
			for(int i=0;i<(numstring.length()-3);i++) {
				newnumber=newnumber+numstring.charAt(i);
			}
			System.out.println(newnumber);
			for(int i=(numstring.length()-3);i<numstring.length();i++) {
				newnumberlast=newnumberlast+numstring.charAt(i);
			}
			System.out.println(newnumberlast);
			int num1=Integer.valueOf(newnumber);
			DecimalFormat formatter=new DecimalFormat("#,##");
			nepaliformat1=(formatter.format(num1));
			System.out.println("The Nepali format is : "+nepaliformat1+","+newnumberlast);
			
		}
	}

}
