package Octex_18102024_Switch;

import java.util.Scanner;

public class Lab075_without_break
{
    public static void main(String[] args) {

        //switch condition
        //user-Enter iny no from 1 to 7
        //which day it is it
        //1->mon, 4->thur, 7->sun, 8->invalid
// if we dont add breack the where contion match from there all conditions will exe
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from (1-7)");
        int day= sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wedusday");

            case 4:
                System.out.println("Thrusday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("Wrong input");
        }

    }
}
