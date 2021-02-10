import java.util.Scanner;
public class QN8 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter number of years");
         int year=sc.nextInt();
         sc.close();
         if(year%400==0 && year%4==0){
             System.out.println("leap year");
         }
         else{
             System.out.println("not leap year");
         }  
    }   
}
