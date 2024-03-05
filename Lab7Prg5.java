import java.util.*;
class base
{
    void display()
    {
        System.out.println("In base display");
    }
}
class derived extends base
{
    void display()
    {
        System.out.println("In derived display");
    }
    void show()
    {
        System.out.println("In derived show");
    }
}
class Called
{
    public static void main(String[] args)
    {
        base b1 = new base();
        base b2 = new derived();
        b1.display();
        b2.display();
        //b1.show();
        //b2.show();   
    }
}
