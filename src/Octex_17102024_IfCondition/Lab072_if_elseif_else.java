package Octex_17102024_IfCondition;

import java.util.Scanner;

public class Lab072_if_elseif_else
{
    public static void main(String[] args) {
        //int no1 =30;
        //int no2 =20;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st no");
        int no1=sc.nextInt();

        System.out.println("Enter 2ndno");
        int no2 = sc.nextInt();

        //1. no1>n02
        //2. no2>no1
        //3. no1==num2

        if(no1>no2)
        {
            System.out.println("no1 is greater");
        } else if (no2>no1)
        {
            System.out.println("no2 is greater");

        }
        else
        {
            System.out.println("Both r equal");
        }


    }
}
