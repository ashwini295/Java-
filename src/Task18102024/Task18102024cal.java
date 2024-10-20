package Task18102024;

import java.util.Scanner;

public class Task18102024cal
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st no");
        int no1 =sc.nextInt();
        System.out.println("Enter 2nd no");
        int no2= sc.nextInt();
        System.out.println("Enter the operation + - * /");
        String operation =sc.next();

        switch(operation)
        {
            case "+":
                System.out.println("Addition is");
                System.out.println(no1+no2);
                break;

            case "-":
                System.out.println("sub is");
                System.out.println(no1-no2);
                break;

            case "*":
                System.out.println("Multiplication is");
                System.out.println(no1*no2);
                break;

                case "/":
                    System.out.println("Division is");
                    System.out.println(no1/no2);
                    break;

            default:
                System.out.println("Wrong operation");
                break;



        }



    }
}
