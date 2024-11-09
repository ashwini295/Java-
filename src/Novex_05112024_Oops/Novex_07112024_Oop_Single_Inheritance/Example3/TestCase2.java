package Novex_05112024_Oops.Novex_07112024_Oop_Single_Inheritance.Example3;

public class TestCase2 extends Common_BseTest
{
    TestCase2()
    {
        System.out.println("DC--->Testcase2");
    }

    void Print()
    {
        System.out.println("I am in TC2");
        StratBrowser();
        CloseBrowser();
        readExcel_File();

    }
}
