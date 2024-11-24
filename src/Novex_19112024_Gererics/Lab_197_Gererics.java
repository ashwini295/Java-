package Novex_19112024_Gererics;

public class Lab_197_Gererics
{
    public static void main(String[] args) {
        //Generics in java are a powerful feature introduced in java 5 that allows developers to create
        //classes,interfaces and methods with type parameters it enhances the code reusability

        //+ sum two int
        //+ concatenate two int
        temp_sum(12, 90);
        temp_sum(9.7,90.98);

    }//here for two data type we have created two methods in next pgm will see solution

        public static Integer temp_sum(Integer a, Integer b)
        {
            return a+b;
        }

        public static double temp_sum(double a, double b)
        {
            return a+b;
        }





}
