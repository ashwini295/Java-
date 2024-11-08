package Novex_05112024_Oops;

public class Lab139_oops_object_class
{
    public static void main(String[] args)
    {
        StudentsATB s1 = new StudentsATB();
        s1.name="Ashwini";
        // studentATB s1;-> this class loaded in classloader
        //s1-> object reference
        //new studentATB-> object creation

        s1.eat(10);
        System.out.println(s1.name);
        System.out.println(s1);


        StudentsATB s2 = new StudentsATB();
        s2.name="Archana";
        s2.eat(20);
        System.out.println(s2.name);
        System.out.println(s2);


        Dog d1 = new Dog();
        d1.d_age = 10;
        d1.d_name= "Jo-Jo";
        System.out.println("Name of Dog is" + d1.d_name);
        System.out.println("Age of dog is" + d1.d_age);
        d1.bark("Bho", 10);
        d1.d_sleep(10);



        Dog d2 = new Dog();
        d2.d_name = "Tun-tun";
        d2.d_age= 20;
        System.out.println("Name of Dog is" + d2.d_name);
        System.out.println("Age of dog is" + d2.d_age);
        d1.bark("Bho-Bho", 20);
        d1.d_sleep(20);

        Dog d3 = new Dog();
        d3.d_age= 30;
        d3.d_name= "Pom";
        System.out.println("Name of Dog is" + d3.d_name);
        System.out.println("Age of dog is" + d3.d_age);
       d1.bark("Bho-Bho-Bho", 30);
        d1.d_sleep(30);
//
//


    }
}
