
import java.util.Scanner;

public class Qn14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.prinln("enter size of first matrix: ");
        int m1row = sc.nextInt();
        int m1col = sc.nextInt();
        
        int matrix1[][] = new int[m1row][m1col];
        int matrix2[][] = new int[m1row][m1col];

        // entering elaments of first matrix---
        System.out.println("Enter the elements of first matrix : ");
        for (int i = 0; i < m1row; i++) {
            for (int j = 0; j < m1col; i++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        for(int el : matrix1){
            System.out.println(el);
        }
       
    }
}