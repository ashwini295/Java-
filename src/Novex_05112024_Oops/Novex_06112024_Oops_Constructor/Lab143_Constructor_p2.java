package Novex_05112024_Oops.Novex_06112024_Oops_Constructor;

import java.util.Scanner;

public class Lab143_Constructor_p2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        car2 c2 = new car2("TaTA_Nano", 2020);
        System.out.println("Car model is" + c2.model );
        System.out.println("Car launch year is " + c2.year);
        c2.display();

        car2 c3 = new car2("Ashwini_Car", 2017);
        System.out.println("Car model is" + c3.model );
        System.out.println("Car launch year is " + c3.year);
        c3.display();

        String model;
        int year;

        System.out.println("Enter th model name");
        model= sc.next();
        System.out.println("Enter the year");
        year = sc.nextInt();

        car2 c4 = new car2(model, year);
        System.out.println("Car model is" + c4.model );
        System.out.println("Car launch year is " + c4.year);
        c4.display();


    }

}

class car2
{
    String model ;
    int year;
 // parameterized constructor allows you to pass specific values when creating an object enabling initialization
 // with custom data

    car2(String model,int year)
    {
        System.out.println("Parameterized constructor");
        this.model= model;
        this.year=year;

        //this refers to current obj


    }

    void  display()
    {
        System.out.println("Car details " +this.year+ "->" +this.model );
    }

}
