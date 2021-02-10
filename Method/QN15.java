import java.util.*;

class ispalindrome {
    static int reverseDigits(int num) {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    static int isPalindrome(int n) {
        int rev_n = reverseDigits(n);

        if (rev_n == n)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer");
        int n = sc.nextInt();
        System.out.println("Is: " + n + " a Palindrome number?:  " + (isPalindrome(n) == 1 ? "\ttrue" : "\tfalse"));
        sc.close();
    }
}