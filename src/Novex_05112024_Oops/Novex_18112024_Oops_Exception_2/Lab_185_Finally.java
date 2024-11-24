package Novex_05112024_Oops.Novex_18112024_Oops_Exception_2;

import java.util.Scanner;

public class Lab_185_Finally
{
    public static void main(String[] args)
    {Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int a = 10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Hello");
            sc.close();
        }

    }
}
