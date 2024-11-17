package Novex_05112024_Oops.Novex_15112024_Oops_Wrpper_Class_Exception_H;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_176_handle_exception
{
    public static void main(String[] args) throws FileNotFoundException {


        //unchecked->jvm doesnt know
        int a =10;
        try {
            int c = a / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       // System.out.println(c);


    }
}
