package Novex_05112024_Oops.Novex_07112024_Oop_Single_Inheritance.Example1;

public class Lab145_Single_Inheritance
{
    // Inheritance in java is a fundamental concept of object oriented programing that allows one class(the subclass)
    // Super clas| Parent class| Father class-> The class from which properties and methods are inherited
    //Sub class|Child|Son-> The class that inherts from another class
    // extends Keyword: Used to indicates that class is inheriting from another class
    //1. Single, 2. Multilevel, 3. Multiple, 4.Hirarchical, 5.Hybrid
    //java supports only Single


    public static void main(String[] args)
    {
        //Single-> son will get the attribute from father
        //only one son and one father

        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();

        Father f1 = new Father();
        //f1.bhk3()-> not possible bez father has not extended

    }
}
