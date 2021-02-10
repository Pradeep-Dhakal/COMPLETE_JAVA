
import java.util.Scanner;

class SubSequence {
    static boolean isSubstring(String str1, String str2, int m, int n) {
        // Base Cases
        if (m == 0)
            return true;
        if (n == 0)
            return false;

        // If last characters of two strings are matching
        if (str1.charAt(m - 1) == str2.charAt(n - 1))
            return isSubstring(str1, str2, m - 1, n - 1);

        // If last characters are not matching
        return isSubstring(str1, str2, m, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1 = sc.nextLine();
        System.out.println("Enter String 1");
        String str2 = sc.nextLine();
        int l1 = str1.length();
        int l2 = str2.length();
        boolean result = isSubstring(str1, str2, l1, l2);
        if (result)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}