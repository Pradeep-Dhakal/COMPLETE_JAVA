import java.io.*;
import java.util.Scanner;

class Main
{
    public static void main (String [] args)
    {
        final String PASSWORD = "5730";
        int count=3;
        for (int passAttempts = 0; passAttempts < 3; passAttempts++) 
        {
            System.out.println("P.S. Actual PIN is 5730");
            System.out.print("Please input the pin: ");
            Scanner input = new Scanner(System.in);
            String inputPass = input.nextLine();

            if (!(inputPass.equals(PASSWORD))) 
            {
               count-=1;
                System.out.println("\nSorry, your PIN is incorrect. You have "+count+" attempts left");
                 
            } 
            else 
            {
                System.out.println("\nWelcome!");
                break;
            }
        }
    }
}

