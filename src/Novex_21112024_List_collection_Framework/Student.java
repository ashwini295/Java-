package Novex_21112024_List_collection_Framework;

public class Student
{

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setRollNo(String rollNo)
    {
        this.rollNo = rollNo;
    }

    private String name;
    private String rollNo;

    public String getName()
    {
        return name;
    }

    public String getRollNo()
    {
        return rollNo;
    }

    public void printDetails()
    {
        System.out.println("Student_Name_=" +this.name);
        System.out.println("Student_RollNo_=" +this.rollNo);

    }
}
