package Novex_20112024_List;

import java.util.ArrayList;
import java.util.List;

public class Lab_204_Nested_ArrayList
{
    public static void main(String[] args)
    {
        List fruits1 = new ArrayList<>();
        fruits1.add("Mango");
        fruits1.add("Apple");
        fruits1.add("banana");
        System.out.println(fruits1);

        List fruits2 = new ArrayList<>();
        fruits2.add("Mango1");
        fruits2.add("Apple1");
        fruits2.add("banana1");
        System.out.println(fruits2);

        List all_fruits = new ArrayList<>();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        System.out.println(all_fruits);


    }
}
