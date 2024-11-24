package Novex_22112024_Map_collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab_Map_221
{
    public static void main(String[] args)
    {
        Map<String,Object> student1 = new HashMap<>();
        student1.put("name","Diwakar");
        student1.put("Phone","9090909099");
        student1.put("Address","Kolhapur");
        System.out.println(student1);

        Map<String,Object>student2 = new HashMap<>();
        student2.put("name","Ashwini");
        student2.put("Phone","9999999999");
        student2.put("Address","Vijaypur");
        System.out.println(student2);

        List students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);



    }
}
