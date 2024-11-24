package Novex_21112024_List_collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_213_HS_LHS_TS
{
    public static void main(String[] args)
    {
        //the only diff between all of them is how we store

        Set hs = new HashSet<>();//it uses hashing mechanisum//no_order//no_duplicates
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);

        Set LHS= new LinkedHashSet();//Here order will be same but no duplicates are allowed
        LHS.add("Apple");
        LHS.add("Orange");
        LHS.add("Watermelon");
        LHS.add("Watermelon");
        LHS.add(null);
        System.out.println(LHS);


        Set TS = new TreeSet<>();//here order will be maintain n natural sorting will be done
        TS.add("Orange");
        TS.add("Apple");
        TS.add("Watermelon");
        TS.add("Watermelon");
        //TS.add(null); null can not be allowed as sorting will not be done
        //same way differnt data type also will not be allowed as we cant sort it too
        System.out.println(TS);







    }
}
