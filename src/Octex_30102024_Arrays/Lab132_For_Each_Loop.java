package Octex_30102024_Arrays;

public class Lab132_For_Each_Loop
{
    public static void main(String[] args) {
        // for each loop is called as enhanced for loop
        int []a = new int[3];
        a[0]= 90;
        a[1]=91;
        a[2]=92;

        for(int i = 0; i< a.length; i++)
        {
            System.out.println(a[i]);
        }

        for(int i:a)// for each loop
        {
            System.out.println(i);
        }

        String []name = {"BC","XYZ","PQR"};
        for(String i:name)
        {
            System.out.println(i);
        }

//syntax
        //for(dataType ref_name: array)
        //{code to be exe}



    }
}
