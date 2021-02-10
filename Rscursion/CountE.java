import java.util.Scanner;
public class CountE {
    public static int countChar(String str, String character) {
        if (str.length() == 0) {
            return 0;
        }

        if ((str.substring(0, 1).equals(character))) {
            return 1 + countChar(str.substring(1), character);
        }

        return countChar(str.substring(1), character);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();
        String chr="E";
        System.out.println( countChar(str,chr));
        sc.close();
    }
}