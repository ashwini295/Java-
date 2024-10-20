package Octex_18102024_Switch;

import java.util.Scanner;

public class Lab076
{
    public static void main(String[] args) {


        //web automation
        //will ask user which browser u want to run the code
        //chrome->exe chrome
        //firefox-> exe firefox
        //edge-> edge cases

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();
        switch (browser)
        {
            case "Chrome":
                System.out.println("Starting chrome");
                System.out.println("TC......exe");
                break;

            case "Firefox":
                System.out.println("Statring firefox");
                System.out.println("TC.......exe");
                break;

            case "Edge":
                System.out.println("Strting edge");
                System.out.println("TC......exe");
                break;

            default:
                System.out.println("Wrong browser");
                break;


        }
        sc.close();
    }
}
