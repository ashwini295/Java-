package Novex_05112024_Oops.Novex_18112024_Oops_Exception_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_192_Throws
{
    public static void main(String[] args)//here by adding throws exception we cn handle it method level as well
    {
        //throes->
        try {
            FileInputStream fileInputStream = new FileInputStream("C://a.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
