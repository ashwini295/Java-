package Novex_19112024_Gererics;

public class Lab_197_generic_solution
{
    public static void main(String[] args)
    {
        temp_sum(23,45);
        temp_sum(10.10,90.90);
        temp_sum("Ashwini","Archana");

    }

    public static <T> T temp_sum(T a,T b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }


}
