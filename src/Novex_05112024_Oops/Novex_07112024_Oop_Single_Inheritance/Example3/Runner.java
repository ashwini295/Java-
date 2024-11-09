package Novex_05112024_Oops.Novex_07112024_Oop_Single_Inheritance.Example3;

public class Runner
{
    public static void main(String[] args)
    {
        TestCase1 t1 = new TestCase1();
        t1.testcase();

        TestCase2 t2= new TestCase2();
        t2.Print();

    }
    // if all the classes are within same package then no need to import
    // if any class is present in the different package then need to import and make the classes as public
}
