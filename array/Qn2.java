import java.util.Scanner;

class Arrsum {
    static int sum(int[] x) {
        int sum = 0;
        int average = 0;
        int number=x.length;
        for (int elem : x) {
            sum = sum + elem;
            average = sum / number;

        }
        System.out.println("\nthe sum of array is: " + sum);
        System.out.println("the average of array is: " + average);

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter The array element");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("entered array elements are: ");
      
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");

        }
        sum(arr);
        sc.close();
    }
}