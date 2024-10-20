package Octex_15102024_Ternary;

public class Lab062
{
    public static void main(String[] args) {
        //nested ternay opertor
         //resut=condition1?expression1:(condition2?expression2:expression

        //if the score>=90 A grade
        //if the score in between 80 and 89 B grade
        // if the score in between 70 and 79 C grade
        // if the score in between 60 and 69 D grade
        // if the score below 60 E grade

        int score =85;
        String grade = (score>=90)?"A": (score>=80)?"B": (score>=70)?"C": (score>=60)?"D":"E";
        System.out.println("Grade is"+ grade);
        System.out.printf("your grade is %s", grade);

    }
}
