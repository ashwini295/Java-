package Novex_05112024_Oops.Novex_12112024_Oops_Super_Keyword_Abstraction;

public class Lab_162_multiple_interface
{
    public static void main(String[] args) {
        child1 c1 = new child1();
        c1.f1();
        c1.f2();
        c1.f3();
        c1.f4();
        c1.same();
    }
//this is the example of multiple inheritance if both the infterface having same name method then in child implementaion
    //of only one method should be given
}

class child1 implements father, mother
{

    @Override
    public void f1()
    {
        System.out.println("f1 implementation");
    }

    @Override
    public void f2()
    {
        System.out.println("f2 implementation");
    }

    @Override
    public void same()
    {
        System.out.println(" same only 1 implemetation ");
    }

    @Override
    public void f3() {
        System.out.println("f3 implementation");
    }

    @Override
    public void f4() {
        System.out.println("f4 implementation");
    }
}

interface father
{
    void f1();
    void f2();
    void same();
}
interface mother
{
    void f3();
    void f4();
    void same();
}
