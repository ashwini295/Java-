package Novex_05112024_Oops.Novex_08112024_Oop_Polymorphism;

public class Lab_151
{
    public static void main(String[] args)
    {
        Ashwini a1 = new Ashwini();
        a1.home();

        Father f1= new Father();
        f1.home();

        //Dynamic Distpatcher
        Father f2 = new Ashwini();
        f2.home();

    }
}

class Father
{
    void home()
    {
        System.out.println("Father 2 BHK");
    }

}
class Ashwini extends Father
{
    @Override
    void home()
    {
        System.out.println("Child Ashiwni 4 BHK");
    }
}
//overlod means with same name diff parameters in one class->compile time
//override means same name same arg with diff class using extend->run time