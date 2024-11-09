package Novex_05112024_Oops.Novex_07112024_Oop_Single_Inheritance.Novex07112024_Oop_Multilevel_Inheritance;

public class Lab147_Mulilevel
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.home();
        c.gf();
        c.extra();
        c.childExtra();
//here home and gf are used in all the classes but hre jvm 1st check for child if its there then it will exe child
//if not present in child then it will exe father is present
        //If father dont have then it will exe grand father

        Father f = new Father();
        f.home();
        f.gf();
        f.extra();

        GrandFather g = new GrandFather();
        g.gf();
        g.home();
    }

}
