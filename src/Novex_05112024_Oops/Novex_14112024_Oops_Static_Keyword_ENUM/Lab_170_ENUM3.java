package Novex_05112024_Oops.Novex_14112024_Oops_Static_Keyword_ENUM;

public class Lab_170_ENUM3
{
}
enum color
{
    RED("FF0000"),
    BLACK("FFFFF"),
    WHITE("00000");

    private String hexcode;

    color(String hexcode) {
        this.hexcode = hexcode;
    }

    String getHexcode()
    {
        return this.hexcode;
    }
}
