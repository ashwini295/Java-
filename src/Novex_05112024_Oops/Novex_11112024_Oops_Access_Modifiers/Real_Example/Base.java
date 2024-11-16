package Novex_05112024_Oops.Novex_11112024_Oops_Access_Modifiers.Real_Example;

public class Base
{
    private String Browser;

    Base()
    {
        System.out.println("DC->Base class");
    }
    Base(String b)
    {
        System.out.println("PC->Base Class");
    }

    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser, boolean isAuth)
    {
        if(isAuth)
        {
            this.Browser = browser;
        }
        else
        {
            System.out.println("Not allowed");
        }
    }
    void open_browser()
    {
        System.out.println("Opening browser");
    }
    public void open_broeser(String browsername)
    {
        System.out.println("open browser"+browsername);
    }
    void close_browser()
    {
        System.out.println("Closing browser");
    }
}
