package Task15102024;

public class Task151022D
{
    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);


        //A-> --a-> 19 a->19
        //B-> a++->19 a->20
        //C-> --a->20 a->19


    }

}
