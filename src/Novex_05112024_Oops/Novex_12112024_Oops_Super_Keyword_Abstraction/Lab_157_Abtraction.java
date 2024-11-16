package Novex_05112024_Oops.Novex_12112024_Oops_Super_Keyword_Abstraction;

public class Lab_157_Abtraction
{
    //in java abstract and interface these keywords are used for abstrction
    //it can be used for hiding the details of class or methods
    //sowing only essentials
    //eg.car we know only outside part but dont know the engine,clucher part this is hidden
    // if a class does not have any abstract method then its concrete class
    //abstract class cant be final
    public static void main(String[] args) {
        Ashwini a = new Ashwini();
        a.loan30K();
        a.loan50K();
        a.loan1();
    }

}
class Ashwini extends loan
{//abstraction is basically used to froce the methods to child
    @Override
    void loan50K() {
        System.out.println("Giving the 50k loan");
    }

    @Override
    void loan30K() {
        System.out.println("giving 30k loan");
    }
}

abstract class loan{
    abstract void loan50K();
    abstract  void loan30K();

    void loan1()
    {
        System.out.println("loan 1 is there");
    }


}

class person//concreate
{

}
