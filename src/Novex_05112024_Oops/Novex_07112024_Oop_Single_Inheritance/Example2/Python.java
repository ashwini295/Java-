package Novex_05112024_Oops.Novex_07112024_Oop_Single_Inheritance.Example2;

public class Python extends Programming
{
    //Extend- is A
    //Python is a programming

    void print()
    {
        System.out.println(author);
        System.out.println(version);
    }

    public static void main(String[] args)
    {
        Python p1 = new Python(); //here python is extended so programming default constructor called(Constructor chainig)
        System.out.println(p1.author);
        System.out.println(p1.version);

        p1.print();


    }

}
