package Novex_21112024_List_collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab211_AL_Class
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Ashwini","1");
        Student s2 = new Student("Mahantesh", "2");
        Student s3 = new Student("Archna","3");

        List<Student> myStudent= new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

        System.out.println(myStudent);
    }
}
