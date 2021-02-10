import java.util.Scanner;
public class Qn15 {
        public static void main(String[] args) {
            Scanner Sc=new Scanner(System.in);
            System.out.println("enter three digit number to check");
    
            int num =Sc.nextInt();
            Sc.close();
            int reversedInt = 0, rem, ornum; //here revint=reverse integer rem=reminder  ornum=original number
    
            ornum = num;
    
            // reversed integer is stored in variable 
            while( num != 0 )
            {
                rem = num % 10;
                reversedInt = reversedInt * 10 + rem;
                num  /= 10;
            }
    
            // palindrome if orignalInteger and reversedInteger are equal
            if (ornum == reversedInt)
                System.out.println(ornum + " is a palindrome.");
            else
                System.out.println(ornum+ " is not a palindrome.");
        }
    }
    

