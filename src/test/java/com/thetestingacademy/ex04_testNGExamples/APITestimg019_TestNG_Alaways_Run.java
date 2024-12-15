package com.thetestingacademy.ex04_testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITestimg019_TestNG_Alaways_Run
{
    @Test
    public void test01()
    {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test02()
    {
        Assert.assertTrue(true);
    }

    @Test
    public void test03()
    {
        Assert.assertTrue(true);
    }

}
