package Octex_23102024_Function;

public class Lab114 {
    public static void main(String[] args) {
        // user defined functions
        //1. witameter and without return typehout par
        for(int i=0; i<5;i++)
        {
            fun();
        }
        //2.  without parameter and with return type
        String retured_value = fun_hello();
        System.out.println(retured_value);

        int voting_age = age_vote();
        if(voting_age>=18)
        {
            System.out.println("You are allowed to vote");
        }
        else
        {
            System.out.println("You are not allowed to vote");
        }

        //3. with parameter and without return type

        fun_name("Ashwini");
        fun_name("Ashwini2");
        fun_name("Ashiwni3");
        fun_name("Ashiwni4");

        fun_first_Last_name("Archana", "Hosmani");

        //4. with parameter and with return type

        int sum= sum_of_two_nos(100,200);
        System.out.println(sum);


        //main is also a function which is called by JVM
    }
    //will create the function oustside the main
    //1. witameter and without return typehout par
static void fun()
{
    System.out.println("Hello");
}

    //2.  without parameter and with return type
static String fun_hello()
{
    //write the code
    System.out.println("Hi I am type2");
    return "Yuo r awesome!!!!";

}

static int age_vote()
{
    System.out.println("Hello in type 2 age of voting returned");
    return 18;
}
    //3. with parameter and without return type

    static void fun_name (String name)//without return type means void
    {
        System.out.println("Type 3 My name is "+name);
    }

    static void fun_first_Last_name(String First_name, String Last_name)
    {
        System.out.println("Type 3 My first and last name is "+First_name+" "+Last_name);
    }

    //4. with parameter and with return type
    static int sum_of_two_nos(int a, int b)
    {
        System.out.println("I am in type 4 now");
        return a+b;

    }




}