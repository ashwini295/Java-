package Novex_05112024_Oops.Novex_08112024_Oop_Encapsulation;

public class Lab_153
{
    public static void main(String[] args)
    {
        Person p = new Person("ash@gmail.com", "Ash@123");
        p.getUsername();
        p.setUsername("AAAAAAA");

        p.getPassword();
        p.setPassword("Ashwini@123");

        System.out.println("Username"+p.getUsername());
        System.out.println("Password"+p.getPassword());


    }

}
class Person
{
    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private String Username ;
    private String Password;

    public Person(String username, String password) {
        this.Username = username;
        this.Password = password;
    }
}



