package Task17102024;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Task17102024_Triangle
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side1");
        int side1= sc.nextInt();
        System.out.println("Enter side2");
        int side2 = sc.nextInt();
        System.out.println("Enter side3");
        int side3= sc.nextInt();


        if(side1 == side2 && side1==side3)
        {
            System.out.println("Its a Equilateral triangle");
        } else if (side1!=side2 && side1!=side3)
        {
            System.out.println("Its a Scalene triangle");
        }
        else
        {
            System.out.println("its Isosceles triangle triangle");
        }
        sc.close();
    }
}
