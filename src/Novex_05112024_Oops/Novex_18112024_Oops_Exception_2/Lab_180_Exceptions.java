package Novex_05112024_Oops.Novex_18112024_Oops_Exception_2;

public class Lab_180_Exceptions
{
    public static void main(String[] args)
    {
        int a =0;
        int c = 0;
        try {
            c = 10 / a;

        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        } catch (Throwable e)
        {
            ///throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        //System.out.println(c);//arithmatic exception

        finally
        {
            System.out.println("I will be alaways exe");

        }
       //finally means alaways exe
       //it is used to close the DB connections,scanner class closing thins you can add




    }
}
