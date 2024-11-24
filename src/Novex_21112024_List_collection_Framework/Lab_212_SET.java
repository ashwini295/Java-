package Novex_21112024_List_collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_212_SET
{
    //set is same as collection but it dont allows rhe duplicates
    //se is the interface
    public static void main(String[] args)
    {
        Set hs = new HashSet<>();


        Set lhs = new LinkedHashSet();


        Set ts = new TreeSet();

        hs.add("ashwini");
        hs.add("ashwini");
        hs.add("Ashwini");
        hs.add("aAshwini");
        System.out.println(hs);


    }
}
