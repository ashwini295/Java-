package Novex_05112024_Oops.Novex_11112024_Oops_Super_Keyword_Abstraction;

public class Lab_160_Interface
{
    //interface is a keyword which is used to define user defined datatype
    //interface variables will be inherited to subclass
    //Interface can contain following members
    //Inetrface is also used to create multiple inheritance
    //variablrs declared in the interface are bydefault public final and static
    //1. public final static variables
    //2. public abstraact methods
    //3. public static inner classes
    public static void main(String[] args)
    {
        ABC a = new ABC()
        {
            @Override
            void m1()
            {
                System.out.println("implementayion of m1");

            }
        };
        a.m2();
        a.m1();

    }

}
abstract class ABC
{
    abstract void m1();
    void m2()
    {
        System.out.println("complete method");
    }
    ABC()
    {
        System.out.println("DC");
    }

}

interface  I
        {
            void m1();
            void m2();

            default void m3()
            {
                System.out.println("Complete method default in interface");
            }

            static void m4()
            {
                System.out.println("static method in interface");
            }
        }

