import java.util.Scanner;
class multiplicationOfFive{
   public static void main(String[] args)
{
   int i,n;
   System.out.print("Input the number(Table to be calculated): ");
{
   System.out.print("Input number of terms : ");
    Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            sc.close();

   System.out.println ("\n");
   for(i=0;i<=n;i++) 
     System.out.println(n+" * "+i+" = " +n*i);
   }
}
}