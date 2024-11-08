package Novex_06112024_Oops_Constructor;

public class Lab144_default_constructor
{
    public static void main(String[] args)
    {
        Lab144_default_constructor l1 = new Lab144_default_constructor();
        System.out.println(l1.model);
        System.out.println(l1.year);

        Lab144_default_constructor l2 = new Lab144_default_constructor();
        System.out.println(l2.model);
        System.out.println(l2.year);
    }

    String model;
    int year;


    Lab144_default_constructor()
    {
        model= "Default tata model";
        year = 2019;
    }
}
