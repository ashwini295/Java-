package Novex_05112024_Oops.Novex_18112024_Oops_Exception_2;

public class Lab_194_custom_exception_runner
{
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR", 1000);
        Bank ICICI = new Bank("INR", 2000);
        System.out.println(sbi.add(ICICI));


        Bank jp_chase = new Bank("USD",800);
        //1000+800*85
        System.out.println(sbi.add(jp_chase));
    }
}
