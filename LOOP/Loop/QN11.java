import java.util.Scanner;
class numPyramid {

  public static void main(String[] args)
{
   int i,j,n;
   int a,b;
   Scanner sc = new Scanner(System.in);
   System.out.print ("Input number of rows to diplay pyramid: ");  
		    n = sc.nextInt();
   a=n+4-1;
    for(i=1;i<=n;i++)
   {
   for(b=a;b!=0;b--)
    {
   System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
     System.out.print(i+" ");
     }
	System.out.println();
    a--;
   }
}
}