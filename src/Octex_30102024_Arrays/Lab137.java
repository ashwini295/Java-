package Octex_30102024_Arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Lab137
{
    public static void main(String[] args)
    {
        //right triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no n=5");
        int no = sc.nextInt();
        for(int i=0; i< no; i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }





    }
}
