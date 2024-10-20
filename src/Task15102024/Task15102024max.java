package Task15102024;

public class Task15102024max
{
    public static void main(String[] args) {
        int a=100;
        int b=50;
        int c=30;

       //raught logic

        //a>=b && b>=c-> a
        //b>=c->b
        //c

        int max = (a>=b&&a>=c)?a:(b>=c)?b:(c);
        System.out.println(" Maximum no is" + max);

    }
}
