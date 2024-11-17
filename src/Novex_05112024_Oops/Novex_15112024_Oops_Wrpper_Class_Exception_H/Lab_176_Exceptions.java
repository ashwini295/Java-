package Novex_05112024_Oops.Novex_15112024_Oops_Wrpper_Class_Exception_H;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_176_Exceptions
{
    public static void main(String[] args) throws FileNotFoundException {
        //checked->jvm knows
        FileInputStream file = new FileInputStream("c://a.txt");
        //jvm knows hat this may lead to filenot found so it tellng to handle it

        //unchecked->jvm doesnt know
        int a =10;
        int c = a/0;
        System.out.println(c);


    }
}
