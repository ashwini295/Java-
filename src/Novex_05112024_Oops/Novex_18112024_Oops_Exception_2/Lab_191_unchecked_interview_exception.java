package Novex_05112024_Oops.Novex_18112024_Oops_Exception_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_191_unchecked_interview_exception
{
    public static void main(String[] args)
    {
        try {
            int a =10/0;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("uncheked");
        }



        //checked exceptiob eg
        try{
            FileReader f = new FileReader(new File("C://abc.txt"));
        }catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally checked exception");
        }

    }
}
