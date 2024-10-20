package Octex_16102024;
public class Lab064_argument_console
{
public static void main(String[] args) {
    // create a program to check wheter a will go to goa or not
    // ake a input age
    // age>25->dring alloed->will go goa

    int age = Integer.parseInt(args[1]);
    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(args[2]);
    System.out.println(age >= 25 ? "Allowed to Goa" : "Not alloed to Goa");

    //take input frm cnsole arg
    //Integer.parseInt(args[0])
}

}
