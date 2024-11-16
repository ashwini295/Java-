package Novex_05112024_Oops.Novex_11112024_Oops_Access_Modifiers.Police;

public class cop
{
    public int gun;
    public String iCard;

     cop(int gun)//private modifier restricts the access to the clas itself
    {
        this.gun=gun;
    }
    protected void canIshout()//protected allows witin the package
    {
        System.out.println("Yes, You can!!!!!");
    }
}
