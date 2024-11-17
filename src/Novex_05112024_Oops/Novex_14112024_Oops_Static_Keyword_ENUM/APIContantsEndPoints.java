package Novex_05112024_Oops.Novex_14112024_Oops_Static_Keyword_ENUM;

public enum APIContantsEndPoints
{
    BASE_URL("http//google.com"),
    Login_Page("http//login.com");






    private String name;
    APIContantsEndPoints(String name)
    {
        this.name = name;
    }

    String getValue()
    {
        return name;
    }
}
