package Novex_05112024_Oops.Novex_11112024_Oops_Access_Modifiers.Real_Example;

public class Testcase1 extends Base
{
    public Testcase1()
    {
        super();//parent constructor can be called using super keyword
        System.out.println("DC->Testcase1");
    }
    public void start_tc()
    {
        open_broeser("chrome");
        close_browser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth)
    {
        System.out.println("own logic");
        super.setBrowser(browser, isAuth);
    }
}
