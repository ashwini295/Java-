package Octex_30102024_Arrays;

public class Lab131_Array_Exception
{
    public static void main(String[] args) {
        //arrays are used to loop traverse
        //array size is mandatory while constructing the array obj
        //int a[] = new int[3]- valid
        //int a[]= new int[]- invalid
        // if u r using -ve value as array size then it will give the exception which will throw at runtime

       // int a[]= new int[-1];
        //System.out.println(a);// it will throw exception -ve array size

        int[] a1= new int[5];
        a1[0]=-2;
        a1[1]=-8;
        a1[2]=-100;
        System.out.println(a1[0]);
        System.out.println(a1[1]);
        System.out.println(a1[2]);





    }
}
