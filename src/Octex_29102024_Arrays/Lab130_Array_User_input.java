package Octex_29102024_Arrays;

import java.util.Scanner;

public class Lab130_Array_User_input
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int [] no = new int[size];

        for(int i=0; i<size; i++)
        {
            System.out.println("Enter the no "+(i+1));
            no[i]=sc.nextInt();
        }
        System.out.println("Entered nos are");
        for(int i=0; i< size; i++)
        {
            System.out.println(no[i]);

        }
    }

}
