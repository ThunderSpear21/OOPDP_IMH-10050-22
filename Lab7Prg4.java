import java.util.*;
class grandparent
{
    int a = 1;
    grandparent()
    {
        System.out.println("In Grandparent Constructor" + a);
    }        
    void print()
    {
        this.a = 2*a;
        System.out.println("In Grandparent" + a);
    }
}
class parent extends grandparent
{
    int a = 5;
    parent()
    {
        System.out.println("In Parent Constructor" + a);
    }
    void print()
    {
        this.a = 2*a;
        System.out.println("In Parent" + a);
    }
}
class child extends parent
{
    int a = 10;
    child()
    {
        super();
        System.out.println("In Child Constructor" + a);
    }
    void print()
    {
        this.a = 100;
        super.print();
        System.out.println("In Child" + a);
    }
}
class calling
{
    public static void main(String[] args)
    {
        child obj1 = new child();
        obj1.print();
        parent obj2 = new parent();
        obj2.print();
        grandparent obj3 = new grandparent();
        obj3.print();
    }
}