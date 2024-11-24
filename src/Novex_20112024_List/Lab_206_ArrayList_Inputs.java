package Novex_20112024_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_206_ArrayList_Inputs
{
    public static void main(String[] args)
    {
        //Multiple inputs from the user and store them in seprate
        //Arraylists based on user define category

        //names,ages->store them

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names= new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String ContinueInput = "Y";//control variable for input loop

        while (ContinueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            names.add(name);

            System.out.println("Enter age: ");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to add another record (Y/N)");
            ContinueInput = sc.nextLine();


        }

        //Displaying the collection data
        System.out.println("\n Names: "+names);
        System.out.println("Ages"+ages);

        sc.close();



    }
}
