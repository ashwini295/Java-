package Task15102024;

public class Task15102024ID
{
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        //A-> ++a-> 11 a->11
        //B-> a++-> 11 a->12
        //C-> a++-> 12 a->13

        //A+B+C-> 11+11+12= 34

    }
}
