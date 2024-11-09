package Novex_05112024_Oops.Novex_08112024_Oop_Encapsulation;

import javax.print.attribute.standard.JobOriginatingUserName;
import java.security.PrivateKey;

public class Lab_Lab152 {
    //Encapulation is core principal of oop in java that involes buiding data(attributes)and methods
    //(functions) that operate on that data into sngle unit typically a class

    //1. Data variable hide them they should be accessed by only methods
    //2. Controlled Access-> variables

    //private,protected,public

    public static void main(String[] args)
    {
        Login l = new Login("Ashwini@gmail.com", "Ashwini@123");
        System.out.println("Username "+l.Username);
        l.Passwod="hacker@123";
        System.out.println("Password"  +l.Passwod);
    }

    static class Login {
        String Username;
        String Passwod;


        public Login(String uname, String pass) {
            this.Username = uname;
            this.Passwod = pass;
        }
    }
}

//this is public so any one can change it directly this is not secure way