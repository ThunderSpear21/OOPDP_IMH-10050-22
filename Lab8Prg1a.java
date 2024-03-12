import java.util.*;
class Outer
{
    int x = 10;
    void method1()
    {
        System.out.println("In Outer Class" + x);
    }
    class Inner
    {
        int x = 20;
        void method1()
        {
            System.out.println("In Inner Class" + x);
        }
    }
}
class call
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Outer obj1 = new Outer();
        Outer.Inner obj2 = new Outer().new Inner();
        obj1.method1();
        obj2.method1();
    }
}