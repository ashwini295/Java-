package Octex_29102024_Arrays;

import java.util.Arrays;

public class Lab128_Iterate
{
    public static void main(String[] args) {
        int marks [] = {100,20,30,40,50,60,70,80,90,10};
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[2]);
        System.out.println(marks[5]);

        System.out.println("--------------------------------");

        for(int i =0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        // in case of array for loop alaways starts with 0

        Arrays.sort(marks);
        int i = Arrays.binarySearch(marks, 100);
        System.out.println(i);

        //here array is a predefined class and inary search is always done on sorted arrays
        //its used to search element in sorted array

        // prblems with arrays
        //fixed size, similar data typ
        //if u wnt to add/delete then u have to do shift operation
        //so we use arraylist



    }
}
