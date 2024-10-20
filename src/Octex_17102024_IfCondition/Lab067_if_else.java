package Octex_17102024_IfCondition;

import javax.swing.*;
import java.util.Scanner;

public class Lab067_if_else {
    public static void main(String[] args) {


        System.out.println("Enter ur age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();


        if (age >= 18) {
            System.out.println("You are allowed to vote");
        }
        else
        {
            System.out.println("you are not allowed");
        }

    }
}