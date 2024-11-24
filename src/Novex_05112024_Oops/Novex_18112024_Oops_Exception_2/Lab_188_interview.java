package Novex_05112024_Oops.Novex_18112024_Oops_Exception_2;

public class Lab_188_interview
{
    public static void main(String[] args)
    {
        try
        {
            String s1 ="Ashwini";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        }
        catch (Exception e)
        {
            System.out.println("Problem in code");
            System.out.println(e.getMessage());
        }

    }
}
