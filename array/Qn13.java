import java.util.*;

public class Qn13 {
    static int SecondlargeValue(int[]array2, int size2){
        if(size2<2){
            System.out.println("invallied inout please enter more than 2 elements..");
            return 0;
        }
        
        // for(int i=size2-1; i>0; i--){
        //     if(array2[i]!=(size2-1)){
        //     }
        //     System.out.println("Second largest element is:"+array2[i]);
        //}
        return 0;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("enter the element of array");
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        SecondlargeValue(array, size);
        sc.close();

    }

}
