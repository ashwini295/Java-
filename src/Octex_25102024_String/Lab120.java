package Octex_25102024_String;

public class Lab120
{
    public static void main(String[] args) {
        String name = "Ashwini"; //= operator always create a string in string constant pool
         name = "Hosmani";
         name= "AshwniHosmani";
         name= "Ashwini";

         //here in String contant pool there will be 3 strings will be present
        System.out.println(name);//here last value will be used
        String nameeee  = new String ("Ashwini");
        //when u use new then new memory will be created here name will e part of eap area it should not be present in string contant pool
        String nameeee_1  = new String ("Ashwini");
        String nameeee_2 = nameeee_1;
        //when u create a strinf it will be always present in memory thats why it is immutable

    }
}
