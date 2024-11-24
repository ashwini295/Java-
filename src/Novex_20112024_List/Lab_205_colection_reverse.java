package Novex_20112024_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_205_colection_reverse
{
    public static void main(String[] args)
    {
        List marks = new ArrayList<>();
        marks.add(78);
        marks.add(90);
        marks.add(30);
        marks.add(100);

        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);

        Collections.reverse(marks);
        System.out.println(marks);




    }
}
