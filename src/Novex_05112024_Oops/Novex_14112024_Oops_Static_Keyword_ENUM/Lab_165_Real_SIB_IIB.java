package Novex_05112024_Oops.Novex_14112024_Oops_Static_Keyword_ENUM;

public class Lab_165_Real_SIB_IIB
{
    public static void main(String[] args)
    {
        ATB s1 = new ATB("Ashwini","9090909090");
        ATB s2 = new ATB("Archana","9090909091");
        ATB s3 = new ATB("Sushila","9090909092");
        ATB s4 = new ATB("Dundappa","909090903");
        ATB s5 = new ATB("Mahantesh","909090902");
        s1.readdoc();
        s2.readdoc();  ATB.readdoc();//static method
        System.out.println(ATB.course_name);//static variable
    }

}
class ATB
{
    {
        System.out.println("IIB");
        System.out.println("Reaing code from csv file");
    }
    static
    {
        System.out.println("SIB load the class i will exe");
    }

    public ATB(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    private String name;
    private String phone;
    static  String course_name = "ATB9x";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   static void readdoc()
    {
       // System.out.println(phone);//here phone no will call at the time of class load so not allowed here
        System.out.println("Do assignments");
    }


}
