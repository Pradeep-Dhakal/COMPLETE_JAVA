import java.util.Scanner;
public class QN14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter three digit number");
         int n=sc.nextInt();
         int sum=0;
         sc.close();
    
         for (sum = 0; n > 0; sum += n % 10, n /= 10); 
    

         System.out.println(sum);
        
        }
       
       
        
    }
    

