package Novex_05112024_Oops.Novex_11112024_Oops_Super_Keyword_Abstraction;

public class Lab_161_Interface
{
    public static void main(String[] args) {
        p p1 = new p();
        p1.f1();
        p1.f2();
        p1.f3();
    }

}
class p implements I1
{

    @Override
    public void f1()
    {
        System.out.println("f1");
    }

    @Override
    public void f2()
    {
        System.out.println("f2");

    }

    @Override
    public void f3()
    {
        System.out.println("f3");

    }
}
interface I1
{
    void f1();
    void f2();
    void f3();
}
