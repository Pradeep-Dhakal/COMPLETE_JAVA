import java.util.Scanner;

class Equality {
    public static void isequal(int[] arrayOne, int[] arrayTwo) {
        boolean isEqualOrNot = true;

        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    isEqualOrNot = false;
                }
            }
        } else {
            isEqualOrNot = false;
        }

        if (isEqualOrNot) {
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = SC.nextInt();

        int[] firstArray = new int[size];
        System.out.println("Enter element of first array");
        for (int i = 0; i < size; i++) {
            firstArray[i] = SC.nextInt();
        }
        int[] secondArray = new int[size];
        System.out.println("Enter element of Second array");
        for (int i = 0; i < size; i++) {
            secondArray[i] = SC.nextInt();

        }
        isequal(firstArray, secondArray);
        SC.close();

    }
}