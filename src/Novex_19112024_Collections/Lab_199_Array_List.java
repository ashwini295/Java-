package Novex_19112024_Collections;

import java.util.ArrayList;

public class Lab_199_Array_List
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList<>();
        list.add("Ashwini");
        list.add("Archana");
        list.add("abc");
        list.add("Ashiwni");
        list.add(123);
        list.add(null);

        //Arraylist its a class
        //it has dynamic size
        //it stores the elements in arrays only
        //10->9th element->20th size increase


        System.out.println(list);



    }
}
