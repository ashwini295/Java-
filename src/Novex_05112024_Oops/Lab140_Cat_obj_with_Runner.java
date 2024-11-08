package Novex_05112024_Oops;

import java.sql.SQLOutput;

public class Lab140_Cat_obj_with_Runner
{
    public static void main(String[] args)
    {
        Lab140_Cat_obj_with_Runner ct = new Lab140_Cat_obj_with_Runner();
        ct.C_Name = "Minku";
        ct.C_Age= 8;
        System.out.println("Name of cat is" +ct.C_Name);
        System.out.println("Age of cat is " +ct.C_Age);
        ct.eat("Cat_food");
        ct.sleep(12);


        Lab140_Cat_obj_with_Runner ct1 = new Lab140_Cat_obj_with_Runner();
        ct1.C_Name = "Cheru";
        ct1.C_Age = 12;
        System.out.println("Name of ct 2 is" +ct1.C_Name);
        System.out.println("Age of cat is" +ct1.C_Age);
        ct1.eat("Fish");
        ct1.sleep(20);
    }

    String C_Name;
    Integer C_Age;

    void sleep(int hr)
    {
        System.out.println("Cat sleepig hr are" + hr);
    }
    void eat (String food)
    {
        System.out.println("Cat favourite food is" + food);
    }

}
