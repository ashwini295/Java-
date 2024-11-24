package Novex_05112024_Oops.Novex_18112024_Oops_Exception_2;

public class Lab_196_finally_not_exe
{
    public static void main(String[] args) {
        try
        {
            int a = 10/10; //in this case only fnally will not exe
            //System.exit(0);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Not ptinted");
        }

    }
}
