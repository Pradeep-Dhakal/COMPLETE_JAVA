import java.util.Scanner;

public class Qn7 {
    public static void main(String[] args) {
        int num, position, newelemen;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        num = s.nextInt();
        int allelement[] = new int[num + 1];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) {
            allelement[i] = s.nextInt();
        }


        System.out.print("Enter the position  to insert element: ");
        position = s.nextInt();
        System.out.print("Enter the element : ");
        newelemen = s.nextInt();
        for (int i = (num - 1); i >= (position - 1); i--) {
            allelement[i + 1] = allelement[i];
        }


        allelement[position - 1] = newelemen;
        System.out.print("After inserting:");
        for (int i = 0; i < num; i++) {
            System.out.print(allelement[i] + ",");
        }
        System.out.print(allelement[num]);
        s.close();
    }
}