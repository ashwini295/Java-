package Novex_05112024_Oops.Novex_15112024_Oops_Wrpper_Class_Exception_H;

public class Lab_177_Exception_handleing
{
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();//unchecked
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("End");
        //there r two wys to handle the eception
        //try and catch
        //Throws

    }
}
