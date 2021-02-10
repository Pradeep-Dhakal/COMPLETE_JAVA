import java.util.Scanner;
class MiddleSTring {
  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc .nextLine();
        sc.close();
        System.out.print("The middle character in the string: " + middle(str)+"\n");
    }
 public static String middle(String str)
    {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}