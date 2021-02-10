import java.util.*;

class AveageExceptMaxAndMin {
    public static void average(int[] array) {
        int max = array[0];
        int min = array[0];
        float sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            if (array[i] > max)
                max = array[i];
            else if (array[i] < min)
                min = array[i];
        }
        float x = ((sum - max - min) / (array.length - 2));
        System.out.printf(" the average value of an array except the largest and smallest values: %.2f", x);
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=Sc.nextInt();
        int [] array=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            array[i]=Sc.nextInt();
        }
        
        
            
            System.out.println("Original Array: " + Arrays.toString(array));
            
        
        average(array);
        Sc.close();
        
    }

}
