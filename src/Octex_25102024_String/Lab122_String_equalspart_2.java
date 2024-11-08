package Octex_25102024_String;

public class Lab122_String_equalspart_2
{
    public static void main(String[] args) {
        String s1 = "Hello";// this will store in sring cnt pool
        String s4 = "Hello";//now in SCP already string present so new will not be created ony ref will added
        String s2 = new String("Hello");//this will store in heap area/object area
        String s3 = new String("Hello");//this will store in heap area/object area
        String s5 = new String("Hello");//this will store in heap area/object area
        //whenever we use new then new rea will created in heap/object area

        //SCP->1
        //Head/object area->3
        //== comprision

        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s2);

        //equals(content) ->value
        //how to check? equals==value;

        System.out.println(s1.equals(s2));//ans will be true
        System.out.println(s1.equals(s3));//ans will be true
        System.out.println(s1.equals(s4));//ans will be true
        System.out.println(s2.equals(s3));//ans will be true
        System.out.println(s2.equals(s5));//ans will be true
        System.out.println(s3.equals(s5));//ans will be true


    }

    }
