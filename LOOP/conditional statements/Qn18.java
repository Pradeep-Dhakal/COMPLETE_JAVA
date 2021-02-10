import java.util.Scanner;
 class WeekDay {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int input = sc.nextInt();
		
		if(input>=1 && input<=7)
		{
			switch(input)
			{
	case 1: System.out.println("INPUT  "+input+"  " +  "OUTPUT: sunday"); break;
	case 2: System.out.println("INPUT  "+input+"  " +  "OUTPUT: monday"); break;
	case 3: System.out.println("INPUT  "+input+"  " +  "OUTPUT: Tuesday"); break;
	case 4: System.out.println("INPUT  "+input+"  " +  "OUTPUT: Wednesday");break;
	case 5: System.out.println("INPUT  "+input+"  " +  "OUTPUT: Thursday"); break;
	case 6: System.out.println("INPUT  "+input+"  " +  "OUTPUT: Friday"); break;
	case 7: System.out.println("INPUT  "+input+"  " +  "OUTPUT: saturday"); break;
			}
			}
		else
		{
		int i =input%7; 
		
		switch(i)
		{
	case 1: System.out.println("INPUT  "+input+"  " +  "OUTPUT: sunday"); break;
	case 2: System.out.println("INPUT  "+input+"  " +  "OUTPUT: monday"); break;
	case 3: System.out.println("INPUT  "+input+"  " +  "OUTPUT: Tuesday"); break;
	case 4: System.out.println("INPUT  "+input+"  " +  "OUTPUT: Wednesday");break;
       case 5: System.out.println("INPUT  "+input+"  " +  "OUTPUT: Thursday"); break;
	case 6: System.out.println("INPUT  "+input+"  " +  "OUTPUT: Friday"); break;
	case 7: System.out.println("INPUT  "+input+"  " +  "OUTPUT: saturday"); break;
		}
		}	
		}}

