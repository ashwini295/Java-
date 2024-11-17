package Novex_05112024_Oops.Novex_14112024_Oops_Static_Keyword_ENUM;

public class Lab_166
{
    public static void main(String[] args) {


        Automation a1 = new Automation();
        Automation a2 = new Automation();
        System.out.println(a1.driver);
        System.out.println(a2.driver);
        //in parallel exe we cant use static
    }
}

class Automation
{
    static String driver = "ABC";
}
