package Novex_05112024_Oops.Novex_07112024_Oop_Single_Inheritance.Example3;

public class TestCase1 extends Common_BseTest
{
    TestCase1()
    {
        System.out.println("DC of Child");
    }

    void testcase()
    {
        StratBrowser();
        CloseBrowser();
        readExcel_File();

    }
}
