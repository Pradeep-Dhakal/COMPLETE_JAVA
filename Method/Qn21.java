import java.util.Scanner;
import java.util.Objects;

import java.util.Arrays;
import java.util.*;

public class Qn21 {

    public static Integer[] addX(Integer n, Integer[] arr) {
        Integer i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer thet you want to add at last");
        Integer x = sc.nextInt();
        sc.close();

        // create a new ArrayList
        List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(arr));

        // Add the new element
        arrlist.add(x);
        // arrlist.remove(o)

        // Convert the Arraylist to array
        for (int elem : arrlist) {
            System.out.print("array after adding integer at last" + elem + "\t");
        }

        return arr;
    }

    public static void addElement(Integer [] my_array) {
        Scanner sc=new Scanner(System.in);

        //int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
     
         // Insert an element in 3rd position of the array (index->2, value->5)
        System.out.println("enter the endex position whare you want to enter new value: ");
        int Index_position = 2;
        System.out.println("enter new value: ");
        int newValue    = sc.nextInt();
        sc.close();
       System.out.println("Original Array : "+Arrays.toString(my_array));     
        
       for(int i=my_array.length-1; i > Index_position; i--){
         my_array[i] = my_array[i-1];
        }
        my_array[Index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(my_array));
      }

    public static Integer[] removeX(Integer[] arr) {
        Integer i;

        // create a new ArrayList
        List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(arr));

        // Add the new element
        arrlist.remove(x);
        // arrlist.remove(o)

        // Convert the Arraylist to array
        for (int elem : arrlist) {
            System.out.print("array after adding integer at last" + elem + "\t");
        }

        return arr;
    }

    public static void RemoveElement(Integer[] arr, Integer RemoveINdex) {// qns c

        for (Integer i = RemoveINdex; i < arr.length - 1; i++) {

        }
        System.out.print("array efter removing " + RemoveINdex + "is: " + arr);
    }

    public static Integer[] removeTheElement(Integer[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index thet you want to remove between the size of array ");
        Integer index = sc.nextInt();
        sc.close();

        if (arr == null || index < 0 || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        Integer[] anotherArray = new Integer[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }

    public static void SizeOfArray(Integer[] array) {
        System.out.println(array.length);
    }

    public static void display(Integer[] arr) {
        for (int value : arr) {
            System.out.println(value);

        }
    }

    public static void returnIndex(Integer[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        Integer index = sc.nextInt();
        sc.close();
        System.out.println(arr[index]);

    }

    public static Integer returnIndex1(Integer[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        Integer index = sc.nextInt();
        sc.close();
        for (Integer i = 0; i < arr.length; i++) {
            if (arr[index] == arr[i]) {
                System.out.println(arr[index]);

            }

            else {
                return -1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        Integer size = sc.nextInt();
        Integer[] array = new Integer[size];
        System.out.println("enter the Element of array");
        for (Integer i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // Qn21 a=new Qn21();
        System.out.println("\nenter which index thet you want remove");
        Integer num = sc.nextInt();
        addX(size, array);

        addElement(array);// question number a
        RemoveElement(array, num);// question number b
        removeX(array);// question number c
        removeTheElement(array);// question number d
        SizeOfArray(array);// question number e
        returnIndex(array);// question number f
        returnIndex1(array);// question number g
        sc.close();

    }

}
