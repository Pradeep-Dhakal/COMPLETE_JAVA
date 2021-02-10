import java.util.*;
class Decimalnumbers{
    public static void main (String [] args){
        int number=0;
      int sum=0;
      Scanner sc = new Scanner(System.in);
        while (number >= 0) {
          System.out.println("Enter a Number");
          number = sc.nextInt();
            sum = sum + number;
         }
        System.out.println("Sum is:" + sum);
    }
}
