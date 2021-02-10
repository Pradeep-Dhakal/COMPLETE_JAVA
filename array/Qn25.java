import java.util.Scanner;

class RemoveDuplicateElement {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of ayyay: ");
        int size=sc.nextInt(); 
        int array[]=new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
         
         
         System.out.println("Original array length: "+array.length);
         System.out.print("Array elements are: ");
        for (int i = 0; i < array.length; i++)
         {
             System.out.print(array[i]+" ");
         }
         System.out.println("\nThe new length of the array is: "+array_sort(array));
             sc.close();
     }
     
     public static int array_sort(int[] number) {
          int index = 1;
         for (int i = 1; i < number.length; i++) {
             if (number[i] != number[index-1])
                 number[index++] = number[i];
         }
       return index;
    
     }
 }