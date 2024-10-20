package Task17102024;

import java.util.Scanner;

public class Task17102024_Gradecal
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks= sc.nextInt();

        if(marks>=90&&marks<=100)
        {
            System.out.println("Obtained grade A");
        }
        else if(marks>=80&&marks<=89)
        {
            System.out.println("Obtained grade B");
        }
        else if(marks>=70&&marks<=79)
        {
            System.out.println("Obained grade C");
        }
        else if(marks>=60&&marks<=69)
        {
            System.out.println("Obtained grade D");
        }
        else
        {
            System.out.println("Obtained grade F");
        }
        sc.close();
    }
}
