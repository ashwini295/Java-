package Novex_05112024_Oops.Novex_11112024_Oops_Super_Keyword_Abstraction;

import javax.print.attribute.standard.MediaSize;

public class Lab_159
{
    public static void main(String[] args)
    {
        Wagonr r = new Wagonr();
        r.drive();

        Tesala t = new Tesala();
        t.drive();

        //you can not use following modifiews with abstrct method
        //private, static, final, strictfp, synchronized, native
        //the class which inherits from the abstract it must implement all absract methods declared in parent
        //you can not create the object the abstract class
    }

}

 class Wagonr extends Engine
{
    void drive()
    {
        strat_engine();
        stop_engine();
    }

    @Override
    void strat_engine()
    {
        System.out.println("Started engine");

    }

    @Override
    void stop_engine()
    {
        System.out.println("Stopped engine");
    }
}



abstract class Engine
{
    abstract void strat_engine();
    abstract void stop_engine();

}
