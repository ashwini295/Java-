package Octex_25102024_String;

public class Lab121
{
    public static void main(String[] args) {
        String name = "Ashwini";//string will create in string cont pool
        name.toUpperCase();//again PROMOD will create in string cont pool
        System.out.println(name);;//name ref will point to 1st only so o/p will be Ashwini
        name = name.toUpperCase();//now name ref will point to 2nd string in string cont pool
        System.out.println(name);//o/p will be in upper case
        // this concept is called string is immutable

    }
}
