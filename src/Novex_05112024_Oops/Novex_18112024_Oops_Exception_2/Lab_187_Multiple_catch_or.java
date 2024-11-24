package Novex_05112024_Oops.Novex_18112024_Oops_Exception_2;

public class Lab_187_Multiple_catch_or
{
    public static void main(String[] args)
    {
        int a =0;
        int c ;
        try {
            c = 10 / a;
            String s= null;
        }
        catch (ArithmeticException | NullPointerException e )
        {
            System.out.println(e.getMessage());
            System.out.println();
        }

    }
}
