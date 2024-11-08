package Octex_28102024_String_Functions_Arrays;

public class Lab123
{
    public static void main(String[] args)
    {
        String anotherPalindrome= "Niagara. 0 ror again!";
        String roar = anotherPalindrome.substring(11,15);
        System.out.println(roar);

        //substring- many interview questions
        //Substring extracts a portion of the string
        //Concatination- Combine two strings
        String s1="Ashwini";
        String s2 = s1.concat("Hosmani");
        System.out.println(s2);
//  concatination by +
        String s3 = "Warananagar";
        String result = s1 + s2 + s3;
        System.out.println(result);
//Splitting String
        // you can split a string into an array of substrings based on a delimiter

        String fruits = "Apple, Banana, grapes, orange";
        String[] split_fruits= fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);
        System.out.println(split_fruits[3]);

        String fruits1 = "Apple-Banana-grapes-orange";
        String[] split_fruits1= fruits1.split("-");
        System.out.println(split_fruits1[0]);
        System.out.println(split_fruits1[1]);
        System.out.println(split_fruits1[2]);
        System.out.println(split_fruits1[3]);

        String s5 ="Ashwini";
        System.out.println(s5.charAt(3));


        String s6 = "       kodoli      ";
        System.out.println(s6.trim());// remove the spaces before n after

        String s7 = "Dundappa";
        System.out.println(s7.indexOf("a"));// returns the index of the first occurrence of the specified character or substring
        //System.out.println(s7.indexOf("a", 4));// returns the index of the first occurrence of the specified character or substring after the specified index

        String s8 ="Asssshwiiiniiii";
        System.out.println(s8.contains("iii"));// it returns the boolean true or false
        System.out.println(s8.lastIndexOf("i"));//it returns last index of char
        System.out.println(s8.replace("i", "z"));
        System.out.println(s8.startsWith("Asss"));// result will show in true or false
        System.out.println(s8.endsWith("zzz"));


        String s10 = "Hello123 world456";
        String result1 = s10.replaceAll("\\d+", "");// int will replace with blank
        System.out.println(result1);
// diff between replace n replace all is replace all supports the regex






    }
}
