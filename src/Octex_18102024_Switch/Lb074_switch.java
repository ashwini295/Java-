package Octex_18102024_Switch;

import java.util.Scanner;

public class Lb074_switch
{
    public static void main(String[] args) {
        //switch condition
        //user-Enter iny no from 1 to 7
        //which day it is it
        //1->mon, 4->thur, 7->sun, 8->invalid

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from (1-7)");
        int day= sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedusday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}