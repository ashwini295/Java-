package Novex_21112024_List_collection_Framework;

import com.sun.security.jgss.GSSUtil;

import java.util.Stack;

public class Lab_210_stack
{
    public static void main(String[] args) {
        //vector, stack are the legacy classes 95% of the time we r not using it for automation

        //95% of the time we are using ArrayList

        Stack s = new Stack<>();
        //s.add("Ashwini");
        //s.add("Mhantesh");
        //System.out.println(s);

        s.push("Ashwini");
        s.push("Hosmani");
        s.push("Archana");
        s.push("Mom");
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());//peek means at the top
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.add("Mommiii"));
        System.out.println(s);
        s.add("Chetu");//concept wise add n push both are the same
        System.out.println(s);
        s.add(0,"Amesh");
        System.out.println(s);



    }
}
