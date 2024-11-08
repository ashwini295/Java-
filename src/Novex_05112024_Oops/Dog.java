package Novex_05112024_Oops;

public class Dog
{
    String d_name;
    int d_age;



    void d_sleep(int hours)
    {
        System.out.println("Dog sleeping hours " + hours);
    }

    void bark(String voice, int mins)
    {
        System.out.println("Dog barking as" + voice);
        System.out.println("Dog barking in mins" + mins);
    }
}
