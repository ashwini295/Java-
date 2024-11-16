package Novex_05112024_Oops.Novex_11112024_Oops_Super_Keyword_Abstraction;

public class Lab_155_Super
{
    public static void main(String[] args) {


        //super keyword in java is reference variable that allows access to the parent variable, methods n constructors
        //if child is getting created and default constructor is there then parent and child default
        //constructor will be executed this concept is called as constructor chaining
        car c = new car();
    }
}

class  car extends Vehicle
{
    private int maxspeed = 285;

    @Override
    void display() {
        System.out.println("Child");

    }

    car()
    {
        super(10);
        System.out.println("DC->car");
        System.out.println(this.maxspeed);
        System.out.println(super.maxSpeed);
        super.display();
        this.display();
    }
}

class Vehicle
{
    public int maxSpeed=100;

    void display()
    {
        System.out.println("Parent");
    }
    Vehicle()
    {
        System.out.println("DC-> Vehicle");
    }
    Vehicle(int a)
    {
        System.out.println("PC-> Vehicle");
    }
    void message()
    {
        System.out.println("Hello Vehicle");
    }
    void message(int a)
    {
        System.out.println("Hello Vehicle");
    }
}
