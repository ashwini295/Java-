package Novex_05112024_Oops.Novex_08112024_Oop_Polymorphism;

public class Lab_150
{
    //polymorphism is the ability of an object to take many forms
    //Poly means many and morphism means forms when a parent class reference is used to refer to a child class obj
    //Runtime-> Method overriding
    //Compile time-> Method overloading

    public static void main(String[] args) {
        Hond h1 = new Hond();
                h1.bark(); // at the run time it will call


    }

}

class Dog
{
        void bark()
        {
            System.out.println("I am Dog....I will barkkk");
        }

        int age =10;
}
class Hond extends Dog
{
    @Override
    void bark()
    {
        System.out.println("I am hond dog i will bark tooo");
    }
}
