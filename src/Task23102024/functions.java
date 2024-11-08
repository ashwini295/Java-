package Task23102024;

import java.util.Scanner;

public class functions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        int a= sc.nextInt();
        System.out.println("Enter the second no");
        int b= sc.nextInt();

        int sum = sum(a,b);
        System.out.println(sum);

        int sub= sub(a,b);
        System.out.println(sub);

        int mul = mul (a,b);
        System.out.println(mul);

        int div = div(a,b);
        System.out.println(div);



    }

    static int sum(int a, int b)
    {
        System.out.println("Sum of two no is");
        return a+b;
    }

    static int sub(int a, int b)
    {
        System.out.println("Sub is ");
        return a-b;
    }

    static int mul(int a, int b)
    {
        System.out.println("Multiplication is");
        return a*b;
    }

    static int div (int a, int b)
    {
        System.out.println("Division is");
        return a/b;
    }

}
