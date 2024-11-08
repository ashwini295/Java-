package Octex_29102024_Arrays;

public class Lab129Max_Min_value_Array
{
    public static void main(String[] args) {
        //Find maximum and minimum value in array

        int [] array = {25,14,56,15,36,56,77,18,29,49};

        int max = max(array);
        System.out.println("The maximum value in the array is: " + max);

        int min = min(array);
        System.out.println("The minimum value in the array is: " + min);


    }
    static int max(int[] array)
    {
        int max = array [0];
        for(int i=0; i< array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        return max;
    }
    static int min(int[] array)
    {
        int min = array [0];
        for(int i=0; i< array.length;i++)
        {
            if(array[i]<min)
            {
                min = array[i];
            }
        }
        return min;
    }
}
