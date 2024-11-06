package Octex_22102024_While_Loop;

public class Lab107
{
    public static void main(String[] args)
    {
         //take a user input for the age and print the o/p
        //taking input as argument

        String  age = args[0];
        int age1 = Integer.parseInt(age);//string to int conversion
        //System.out.println(age);
       while (age1>0)
       {
           System.out.println(age1);
           age1-- ;
       }

    }
}
