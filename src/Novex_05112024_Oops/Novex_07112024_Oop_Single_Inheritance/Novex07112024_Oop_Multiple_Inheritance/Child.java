package Novex_05112024_Oops.Novex_07112024_Oop_Single_Inheritance.Novex07112024_Oop_Multiple_Inheritance;

public class Child extends Father//, Mother
{
    void CanIuse()
    {
        money();//here money is present in both the classes father and mother so which method need to call here
        // this is the reason multiple inheritance is not supported by the java this is called diamond problem
        //even if mothods are diff then also not allowed only we can solve is by interface
    }
}
