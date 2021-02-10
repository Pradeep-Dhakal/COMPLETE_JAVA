import java.util.Scanner;

class ShortStringInDecendingOrder {
    public static void Decrnding(int count1,  String[] str1 ) {
        String temp1;
        // for  Sorting the strings
        for (int i = 0; i < count1; i++) {
            for (int j = i + 1; j < count1; j++) {
                if (str1[i].compareTo(str1[j]) < 0) {
                    temp1 = str1[i];
                    str1[i] = str1[j];
                    str1[j] = temp1;
                }
            }
        }

        // for displaying the strings after sorting them based on decending order order
        System.out.print("Your inputed Strings in Sorted Order:");
        for (int i = 0; i <= count1 - 1; i++) {
            System.out.print(str1[i] + "\t");
        }

    }

    public static void main(String[] args) {
        int count;
        Scanner sc = new Scanner(System.in);

        //  for asked to enter the count of strings
        System.out.print("Enter number of strings you would like to enter:");
        count = sc.nextInt();

        String str[] = new String[count];

        // for entering the strings and they are stored in an array
        System.out.println("Enter the Strings one by one:");
        for (int i = 0; i < count; i++) {
            str[i] = sc.next();
        }
        
        Decrnding(count, str);
        sc.close();

    }
}