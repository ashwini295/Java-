package Novex_05112024_Oops.Novex_15112024_Oops_Wrpper_Class_Exception_H;

public class Lab_173_wrapper
{
    public static void main(String[] args)
    {
        int a =10;
        Integer b =a;//boxing
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        b.intValue();

        Integer a2 =  42;
        int value = a2;//unboxing
        System.out.println(value);



    }



}
