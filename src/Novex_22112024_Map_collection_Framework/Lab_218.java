package Novex_22112024_Map_collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Lab_218
{
    public static void main(String[] args)
    {
        //Map<String,Integer> map = new HashMap<String, Integer>();->>> old syntax
       // Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map = new HashMap();

        map.put("id",1);
        map.put("id",2);
        map.put("id2",2);
        map.put("id3",3);
        map.put("id4",null);//2 null values are allowed but 2 null keys r not allowed only one null key is allowed
        map.put("id5",null);
        map.put(null,102);
        map.put(null,104);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println();

    }
}
