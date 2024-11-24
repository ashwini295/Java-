package Novex_21112024_List_collection_Framework;

import java.util.Enumeration;
import java.util.Vector;

public class Lab_215_Vector
{
    public static void main(String[] args)
    {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cheery");
        vector.add("Date");

        for(Object o: vector)
        {
            System.out.println(o);
        }

        //for legacy classes we cant use iterator
        //we need to use enumeration

        System.out.println("--------------------------");

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
    }
}
