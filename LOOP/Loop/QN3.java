import java.util.Scanner;
class naturalNumberSUm{   
  public static void main(String[] args)

{
   int i, n, sum=0;
   {
   Scanner scr= new Scanner(System.in);  
        System.out.print("Input number: ");  
         n = scr.nextInt();
         scr.close();
}
  System.out.println("The first n natural numbers are : "+n);
  
 for(i=1;i<=n;i++)
   {
     System.out.println(i);
     sum+=i;
   }
System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);

}
}