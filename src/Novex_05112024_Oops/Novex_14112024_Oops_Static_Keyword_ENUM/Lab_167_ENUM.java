package Novex_05112024_Oops.Novex_14112024_Oops_Static_Keyword_ENUM;

public class Lab_167_ENUM
{
    //ENUM is used to define a constant
    //eg. no of days
    public static void main(String[] args) {
        System.out.println(Day.MON);
        System.out.println(Day.SUN);
    }
}

enum Day
{
    SUN,MON,TUE,WED,THU,FRI,SAT
}
