package Novex_05112024_Oops.Novex_18112024_Oops_Exception_2;

public class Lab_189_interview
{
    public static void main(String[] args)
    {
        final double pi = 3.14;
        int a =0;
        try{
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("div by zero");
        }
        finally {
            System.out.println("I will be exe anyhow!!!!");
        }
    }
}
