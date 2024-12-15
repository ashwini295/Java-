package com.thetestingacademy.ex04_testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITestimg020_TestNG_invocationcount
{
    @Test
    public void test01()
    {
        Assert.assertTrue(true);
    }

    @Test(invocationCount = 5)
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
