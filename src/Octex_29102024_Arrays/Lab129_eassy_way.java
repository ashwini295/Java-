package Octex_29102024_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab129_eassy_way
{
    public static void main(String[] args)
    {
        int [] array = {25,14,56,15,36,56,77,18,29,49};
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
    }
}
