package Octex_18102024_Switch;

public class Lab080
{
    public static void main(String[] args) {
        int itemcode =005;
        switch (itemcode)
        {
            case 001,002,003:
                System.out.println("All r these electronic gadets");
                break;

            case 004,005,006:
                System.out.println("Mech devices");
                break;

            default:
                System.out.println("none");
        }
    }
}
