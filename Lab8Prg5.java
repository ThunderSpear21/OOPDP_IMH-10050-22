class Base1
{
    abstract class Base2
    {
        void display(){};
    }
}
class Derived1 extends Base1
{
    class Derived2 extends Base2
    {
        void display()
        {
            System.out.println("Hello World");
        }
    }
}
class driver
{
    public static void main(String[] args)
    {
        Derived1.Derived2 obj = new Derived1().new Derived2();
        obj.display();
    }
}