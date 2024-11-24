package Novex_21112024_List_collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_209_AL_Iterate
{
    public static void main(String[] args)
    {
        List<String> mylist = new ArrayList<>();
        mylist.add("Ashwini");
        mylist.add("Archana");
        mylist.add("Mahantesh");

        System.out.println("Method 1 to print arraylist");
        for(String str : mylist)
        {
            System.out.println(str);
        }

        System.out.println("Method 2 to print arraylist");
        for(int i=0; i<mylist.size(); i++)
        {
            System.out.println(mylist.get(i));
        }

        System.out.println("Method 3 to print arraylist");
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
