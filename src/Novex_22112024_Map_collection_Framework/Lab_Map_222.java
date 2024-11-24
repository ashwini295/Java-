package Novex_22112024_Map_collection_Framework;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab_Map_222
{
    public static void main(String[] args)
    {
        //Hashtable
        //its synchrised, slow legacy class
        //T1, T2-They will use one by one

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
        //ht1.put(null,null);->null key or value both are not allowed
        System.out.println(ht1);


        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(null,null);//->null key or value both are allowed
        System.out.println(hm);

        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }



    }
}
