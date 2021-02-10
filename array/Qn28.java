import java.util.Scanner;
class Q28 {
    static void smallSmallest(int arr[]) {
        int first, second, arr_size = arr.length;
        if (arr_size < 2) {
            System.out.println(" Invalid Input ");
            return;
        }
        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }

        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" + "smallest element");
        else
            System.out.println("The smallest element is " + first + " and second Smallest" + " element is " + second);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        System.out.print("Enter the array element : ");
        int array[] = new int[size];
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        smallSmallest(array);
        sc.close();
    }
}