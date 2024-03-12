import java.util.*;
interface inter
{
    int x = 10;
    default void func1()
    {
        System.out.println("In default method of interface");
    }
    static void func2()
    {
        System.out.println("In static method of interface");
    }
}
class children implements inter
{
    public static void main(String[] args)
    {
        children ch = new children();
        ch.func1();
        inter.func2();
    }
}