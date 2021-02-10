import java.util.Scanner;

class OddEvenArray {
    public static void even(int [] array1) {
        System.out.print("Even numbers: ");
        for (int element : array1) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }

        }
    }

    public static void odd(int[] array2) {
        System.out.print("\nOdd numbers : ");
        for (int elements : array2) {
            if (elements % 2 != 0) {
                System.out.print(elements + " ");
            }

        }
    }


    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = SC.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = SC.nextInt();
        }
        // OddEvenArray OA=new OddEvenArray();
        even(array);
        odd(array);

        SC.close();

    }

}
