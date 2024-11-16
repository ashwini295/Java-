package Novex_05112024_Oops.Novex_12112024_Oops_Super_Keyword_Abstraction;

public class Lab_158_Abstract
{
    public static void main(String[] args)
    {
        child c = new child();
        c.loan50k();
        c.loan20k();

    }
}
class child extends Father
{

    @Override
    void loan50k() {
        System.out.println("Child cleared 50k loan");
    }
}




abstract class Father
{
    abstract void loan50k();
    void loan20k()
    {
        System.out.println("Cleared 20k loan");
    }

}
