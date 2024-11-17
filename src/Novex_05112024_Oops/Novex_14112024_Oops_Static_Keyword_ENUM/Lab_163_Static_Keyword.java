package Novex_05112024_Oops.Novex_14112024_Oops_Static_Keyword_ENUM;

public class Lab_163_Static_Keyword
{
    public static void main(String[] args)
    {

        //static is a keyword in java
        //non access modifier that is used to indicate a perticular vatiable or method or block or class
        //Belongs to the class
        //static members shared accross all the members
        //they can be accessed even without creating a object
        //static is common to all references/objects
        //static variables values are loaded along with the class
        //you can access it using class

        System.out.println(student.school_name);
        student s = new student();
        System.out.println(s.age);
        student s1 = new student();
        student.school_name="XYZ";
        System.out.println(s.school_name);
        System.out.println(s1.school_name);
    }

}

class student
{
    int age =123;//non static variable//Instance variable
    static String school_name = "ABC";//static keyword


    {
        //instance initialization block
        System.out.println("IIB");
        System.out.println("write a code what u want to do when object is created");
        System.out.println("Read a MYSQL db()");
    }

    static  {
        //static initialization block
        //it will loaded only once when class is loaded
        System.out.println("SIB");
        System.out.println("it will loaded only once when class is loaded");
        System.out.println("it is used to read a excel file");

    }
}
