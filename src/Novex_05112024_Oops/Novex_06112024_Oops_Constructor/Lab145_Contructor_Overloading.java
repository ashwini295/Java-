package Novex_05112024_Oops.Novex_06112024_Oops_Constructor;

public class Lab145_Contructor_Overloading
{
    public static void main(String[] args)
    {
        Lab145_Contructor_Overloading d1 = new Lab145_Contructor_Overloading();
        System.out.println(d1.model);
        System.out.println(d1.year);


        Lab145_Contructor_Overloading d2 = new Lab145_Contructor_Overloading("TATATA",2020);
        System.out.println(d2.model);
        System.out.println(d2.year);



    }
    //constructor overloading allows a class to have multiple constructors with different parameter list
    //This enables different ways to create an object of the same class


    String model;
    int year;


    Lab145_Contructor_Overloading()
    {
        model = "Default Model";
        year = 2016;

    }

    Lab145_Contructor_Overloading(String modellll1, int yearrrr1)
    {
     this.model= modellll1;
     this.year= yearrrr1;
    }
}
