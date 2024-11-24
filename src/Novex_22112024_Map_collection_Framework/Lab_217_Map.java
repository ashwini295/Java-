package Novex_22112024_Map_collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Lab_217_Map
{
    //map is used to store the elements in key value pair
    //{"name":"Ashwini"}
    //map is an interface available in java.util package and introduced in the collection framework API
    //HashMap,TreeMap,LinkedHashMap
    //HashTable Leagcy class
    //A Map can not contain duplicate keys and each key can map to at most one value.
    //Some implementations allow null key and null value like the HashMap and LinkedHashMap, but some do not like TreeMap
    public static void main(String[] args)
    {
        Map m1 = new HashMap<>();
        m1.put("name","Ashwini");
        m1.put("RollNo", 1);
        m1.put("Phone",755835730);
        System.out.println(m1);
    //when single item is there use list and if there is ky value pair use map
    }
}
