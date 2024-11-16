package Novex_05112024_Oops.Novex_12112024_Oops_Super_Keyword_Abstraction;

public class Tesala extends Engine
{


    @Override
    void strat_engine() {
        System.out.println("Tesala starting class");
    }

    @Override
    void stop_engine()
    {
        System.out.println("Tesala stopping class");

    }
    void drive(){
        strat_engine();
        stop_engine();
    }
}
