package Task18102024;

import java.util.Scanner;

public class Task18102024_Month
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month 1...12");
        int month = sc.nextInt();

        switch (month)
        {
            case 1:
                System.out.println("Jan");
                break;

            case 2:
                System.out.println("Feb");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Septenber");
                break;
            case 10:
                System.out.println("octomber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("decemer");
                break;

        }
    }
}
