import java.util.*;

public class QN15 {
    public static void addTwoMatrix(int[][] mat1, int[][] mat2) {
        int row = mat1.length;

        int col = mat2[0].length;
        int[][] Sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j< col; i++) {
                Sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("the sum of two arrays is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; i++) {
                System.out.print(Sum[i][j] + " \t");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int size = sc.nextInt();
        int[][] Matrix1 = new int[size][size];
        int[][] Matrix2 = new int[size][size];
        System.out.println("enter the element of first matrix");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Matrix1[i][j] = sc.nextInt();
            }
        }
     
        System.out.println("enter the element of Second matrix");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                Matrix2[i][j] = sc.nextInt();
            }
        }
      
        addTwoMatrix(Matrix1, Matrix2);
        sc.close();
    }

}
