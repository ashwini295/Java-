package com.thetestingacademy.ex03_testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITestimg016_TestNG_DependsOnMethod
{
    @Test
    public void serverStartedok()
    {
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedok")
    public void method1()
    {
        System.out.println("method1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedok")
    public void method2()
    {
        System.out.println("method2");
        Assert.assertTrue(true);
    }
}
