package Novex_20112024_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_203_ArrayList
{
    public static void main(String[] args)
    {
        List l = new ArrayList();
        l.add("bread");
        l.add("butter");
        l.add("Milk");
        l.add("jam");
        l.add("cheese");
        l.add("buttermilk");
        System.out.println(l);

        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("1"));

        System.out.println("----------Forloop------------");
        for(int i=0; i<l.size(); i++)
        {
            System.out.println(l.get(i));
        }

        System.out.println("----------For each loop----------");
        for(Object o:l)
        {
            System.out.println(o);
        }

        System.out.println("---------------print Arraylist Iterator------------");
        //Iterator-Anchor-go one by one forword->get access to them
        //HsNext()->true- If we have next element
        //Next-> element

        Iterator i = l.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
