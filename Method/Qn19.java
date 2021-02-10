
import java.util.*;

class removeVowel {

    // this function check the user input is vowel of not?
    static boolean isVowel(char ch) {
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            return false;
        }
        return true;
    }

    // this function replace with next char if ther is vowel character in string
    static String replaceConsonants(char[] Str) {
        for (int i = 0; i < Str.length; i++) {
            if (isVowel(Str[i])) {

                //if there is Z it will replace with b because a is vowel alphabet
                if (Str[i] == 'z') {
                    Str[i] = 'b';
                }

                else {
                    // incase of there is no vowel alphabet in string
                    Str[i] = (char) (Str[i] + 1);
                    // if there is two vowels in inputed string 
                    if (isVowel(Str[i])) {
                        Str[i] = (char) (Str[i] + 1);
                    }
                }
            }
        }
        return String.valueOf(Str);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String Str = SC.next();
        System.out.println(replaceConsonants(Str.toCharArray()));
        SC.close();
    }
}
