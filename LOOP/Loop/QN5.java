import java.util.Scanner;
class cubeOfNumber {
   public static void main(String[] args)
{
    int i,n;
    System.out.print("Input number of terms.. ");
    Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            sc.close();

     for(i=1;i<=n;i++)
     {
     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
    }
 }
}