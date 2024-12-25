package com.thetestingacademy.ex03_testNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITestimg017_TestNG_Parameters
{
    @Test
    @Parameters("browser")
    public void demo1(String value)
    {
        System.out.println("browser is"+value);
        //open the browser and select dadada
        if(value.equalsIgnoreCase("chrome"))
        {
            System.out.println("start my testing chrome");
        }

        if(value.equalsIgnoreCase("firefox"))
        {
            System.out.println("start my firefox");
        }

    }
}
