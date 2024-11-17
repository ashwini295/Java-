package Novex_05112024_Oops.Novex_15112024_Oops_Wrpper_Class_Exception_H;

public class Lab_174_Wrapper_Conversion
{
    public static void main(String[] args) {
        //String -> wrapperint-> primitive
        String num = "10";
        Integer a = Integer.valueOf(num);
        int a2=a;

        //String to primitive
        int a3 = Integer.parseInt(num);

        long l = 10 ;
        Short s =23;
        Boolean b = true;
    }
}
