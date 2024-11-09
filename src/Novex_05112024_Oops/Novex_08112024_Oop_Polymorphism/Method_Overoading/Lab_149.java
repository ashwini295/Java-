package Novex_05112024_Oops.Novex_08112024_Oop_Polymorphism.Method_Overoading;

public class Lab_149
{
    public static void main(String[] args)
    {
        MathOperations m1 = new MathOperations();
        int result = m1.add(5,10);
        System.out.println(result);

        int result1 = m1.add(10,10,10);
        System.out.println(result1);


    }
}

class MathOperations
{

    //method overloading
    //same name with diff arg/parameters
    int add(int a, int b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }
}