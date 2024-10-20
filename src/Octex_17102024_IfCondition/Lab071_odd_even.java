package Octex_17102024_IfCondition;

import java.util.Scanner;

public class Lab071_odd_even
{
    public static void main(String[] args) {
        // create the pgm take user i/p
        // check wheher the i/p is even or odd no
        System.out.println("Enter the no");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if(a%2==0)
        {
            System.out.println("its even no");
        }
        else
        {
            System.out.println("Its odd no");
        }
        sc.close();
    }
}
