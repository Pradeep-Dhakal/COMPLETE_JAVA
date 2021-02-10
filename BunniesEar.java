import java.util.Scanner;

public class BunniesEar {
    public int bunnyEars(int bunnies) {
       
        if (bunnies == 0)
            return 0;

        
        return 2 + bunnyEars(bunnies - 1);

    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter total number of bunnies: ");
        int num=SC.nextInt();
        BunniesEar BE = new BunniesEar();
        System.out.print("Total ears of bunnies: " +BE.bunnyEars(num));
        SC.close();
    }

}
