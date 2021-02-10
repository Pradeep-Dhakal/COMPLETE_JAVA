
import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("ënter any number charecter symbol");
        ch = sc.next().charAt(0);
       
        sc.close();
		if(ch >= 65 && ch <= 90)
			System.out.println("Upper");
		else if(ch >= 97 && ch <= 122)
			System.out.println("Lower");
		else if(ch >= 48 && ch <= 57)
			System.out.println("Number");
		else
			System.out.println("Symbol");
	}

        
    }

    

