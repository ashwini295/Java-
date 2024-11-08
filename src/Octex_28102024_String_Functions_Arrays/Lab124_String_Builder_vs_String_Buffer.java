package Octex_28102024_String_Functions_Arrays;

public class Lab124_String_Builder_vs_String_Buffer
{
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer("Ashwini");
        str.append("Hosmani");
        System.out.println(str);
        str.reverse();
        System.out.println(str);



        StringBuilder bdr = new StringBuilder("Ashwini");
        bdr.append("Biradar");
        System.out.println(bdr);
        bdr.reverse();
        System.out.println(bdr);

        //String builder and buffer that provide mutable sequence of char
        // they are designed for efficient sring manipulation operations such as appending,inserting,deleting from string
        //main diff is String builder is not thread safe while buffer is thread safe
        //String builder is faster and more efficient in single threaded env while buffer is safe to use in multi-threaded env



    }
}
