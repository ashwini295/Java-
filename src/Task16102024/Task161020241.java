package Task16102024;

import java.util.Scanner;

public class Task161020241
{
    public static void main(String[] args) {

        String name;
        int age;
        double salary;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Name");
        name = sc.next();
        System.out.println("Enter the age");
        age = sc.nextInt();
        System.out.println("Enter the salary");
        salary = sc.nextDouble();
        System.out.println("Details are" +name);
        System.out.println(+age);
        System.out.println(+salary);
        sc.close();

    }

}
