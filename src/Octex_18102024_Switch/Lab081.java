package Octex_18102024_Switch;

public class Lab081
{
    public static void main(String[] args) {
        int itemcode =001;

        switch (itemcode)
        {
            case 001-> System.out.println("001");//no need to add break
            case 002-> System.out.println("002");
            case 003-> System.out.println("003");
            default -> System.out.println("defaut");
        }
    }
}
