import java.util.Scanner;

class TransposeMatrix {
    public static void transpose(int[][] array, int row, int column) {
        System.out.println("The above matrix before Transpose is ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");

        }
        System.out.println("The above matrix after Transpose is ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String args[]) {
        int i, j;
        System.out.println("Enter total rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int array[][] = new int[row][column];
        System.out.println("Enter matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
                System.out.print(" ");
            }
        }

        transpose(array, row, column);
        sc.nextInt();
        

    }
}