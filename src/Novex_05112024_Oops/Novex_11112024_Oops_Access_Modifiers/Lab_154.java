package Novex_05112024_Oops.Novex_11112024_Oops_Access_Modifiers;

import Novex_05112024_Oops.Novex_11112024_Oops_Access_Modifiers.Real_Example.Base;
import Novex_05112024_Oops.Novex_11112024_Oops_Access_Modifiers.Real_Example.Testcase1;

public class Lab_154
{
    //private, protected, public, Default
    //Access modifiers are keywords that define the visibility or accessibility of classes, methods, and variables
    public static void main(String[] args)
    {
        Testcase1 tc1= new Testcase1();
        tc1.setBrowser("chrome",true);
        tc1.start_tc();

    }
}
