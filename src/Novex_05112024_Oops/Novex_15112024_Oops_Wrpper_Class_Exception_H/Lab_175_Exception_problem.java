package Novex_05112024_Oops.Novex_15112024_Oops_Wrpper_Class_Exception_H;

public class Lab_175_Exception_problem
{
    //An excepton is an event that occurs during the exe of a program that distrupts the normal fow
    //if no exception is handel control will pass to Jvm and it always terminate he program
    //error->u cant handel in java..eg.stackoverflow,outofmemory
    //we can handel te exception
    //there r 2 types of exception
    //1.checked->jvm knows it->compiletime
    //2.unchecked->jvm does not knows it->runtime

    public static void main(String[] args) {
        System.out.println("start of pgm");
        String ip = args[0];//if noyhimg entered arrayindexoutfbond exception
                            //if entered 0 rithmatic exception / by 0
        int a = Integer.parseInt(ip);
        int b = 1000/a;//if entered string number format exception
        System.out.println(b);
        System.out.println("End og pgm");


        //jvm will be initialized(from RAM)
        //create and stats the main thread->main called
        //1)collects the command line args-10
        //String[] args= {10}->
        //2)Lab175_Exception.main()
        //when problem comes in main->jvm
        //jvm will terminate with exception

    }
}
