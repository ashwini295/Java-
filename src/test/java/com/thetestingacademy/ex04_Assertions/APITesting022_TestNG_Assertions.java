package com.thetestingacademy.ex04_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting022_TestNG_Assertions
{
    //TestNG provides two types of assertions
    //1. Hard Assertions
    //2. Soft Assertions

    @Test
    public void test_hardAssertExample()
    {
        System.out.println("Start of the pgm");
        Boolean is_neeru_male = true;
        Assert.assertTrue(is_neeru_male);
        System.out.println("End of the pgm");
        Assert.assertEquals("Ashwini","Ashwini");
        //Assert.assertEquals("Ashwini","ashwini"); its case sensitive
        //if one assertion got fail then rest of the assertions will not exe this is called hard seertions
    }


    public void test_soft_AssertExample()
    {
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(false);
        System.out.println("This line will be exe");
        sa.assertAll();// this will report al collected errors
    }
}
