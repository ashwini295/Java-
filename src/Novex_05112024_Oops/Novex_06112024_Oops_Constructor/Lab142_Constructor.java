package Novex_05112024_Oops.Novex_06112024_Oops_Constructor;

public class Lab142_Constructor
{
    //constroctor in java ae special methods
    //Used to initialize objects when they are created
    //They have a same name as class name and dont have a return type

    //Types of constructor
    //1. default 2. Parameterized

    public static void main(String[] args)
    {
        car tesla = new car();
        System.out.println(tesla.model);
        System.out.println(tesla.name);
        System.out.println(tesla.year);


        car nano = new car();
        nano.model= "TATA";
        nano.name="NANO_Car";
        nano.year=2016;
        System.out.println(nano.model);
        System.out.println(nano.name);
        System.out.println(nano.year);

    }

}
