
import java.util.Scanner;
public class QN7 {
    public static void main(String[] args){
        double tax;
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter your annual income");
        double income =sc.nextDouble();
        sc.close();
         if(income<=100000){
         tax=0;
            System.out.println("tax amount="+tax);
            System.out.println("you dont need to pay tax.. thank you...!!!!");
         }
        else if(income>100000 && income<=150000){

         tax=income*10/100;
         
            System.out.println("tax amount="+tax);}
        else if(income>150000 && income<=250000){
            tax=(income*20/100)+5000;
            System.out.println("tam amount =" +tax);
        }
        else{
        tax=(income*30/100)+30000;
        System.out.println("tax amount="+tax);
        }
    }
}
