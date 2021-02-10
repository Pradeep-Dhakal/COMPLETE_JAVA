import java.util.Scanner;
class increasePatternBy1 {

  public static void main(String[] args)

{
   		int a=1,i,j,num;
   		Scanner sc = new Scanner(System.in);
   		System.out.print("Input number of rowsto display : ");
		num = sc.nextInt();

   		for(i=1;i<=num;i++)
   		{
		for(j=1;j<=i;j++)
	   	System.out.print(a++);
	   	System.out.println("");
	   	}  		
	}
	}