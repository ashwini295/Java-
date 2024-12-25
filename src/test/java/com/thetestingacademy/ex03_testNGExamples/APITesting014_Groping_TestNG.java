package com.thetestingacademy.ex03_testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting014_Groping_TestNG
{
    @Test(groups = {"sanity","qa"})
    public void sanityRun()
    {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"reg"})
    public void RegRun()
    {
        System.out.println("Reg");
        Assert.assertTrue(false);
    }


    @Test(groups = {"qa"})
    public void SmokeRun()
    {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
