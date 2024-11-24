package Novex_22112024_Map_collection_Framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab_219_Map_Real_Example
{
    public static void main(String[] args)
    {
        Map<String,Object>student1 = new HashMap<>();
        student1.put("name","Diwakar");
        student1.put("Phone","9090909099");
        student1.put("Address","Kolhapur");
        System.out.println(student1);

        Set Book_read_items = new HashSet<>();
        Book_read_items.add("Rich Dad Poor dad");
        Book_read_items.add("Spaiens");
        Book_read_items.add("Eat the frog");
        Book_read_items.add("C");
        System.out.println(Book_read_items);
    }
}
