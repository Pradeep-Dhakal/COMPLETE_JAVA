
import java.util.Scanner;
class OddNaturalNumber {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("enter numnber of terms");
        n = Sc.nextInt();
        Sc.close();
        System.out.println("\n the odd numbers are");  
        System.out.println("");
        for(i=1;i<=n; i++)
        {
            System.out.println (2*i-1);
            sum+=2*i-1;
          }
          System.out.println ("The Sum of odd Natural Number upto " +n+" terms is: " +sum);
    }
       
  }
  
