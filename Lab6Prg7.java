import java.util.*;
class Shapes
{
    void getArea()
    {
        System.out.println("In Grandparent.\nEnter the values of l b and h");
    }
}
class Rectangle extends Shapes
{
    int l,b;
    void getArea()
    {
        System.out.println(l*b);
    }
    
}
class Box extends Rectangle
{
    int h;
    void getArea()
    {
        System.out.println(2*(l*b + b*h + l*h));
    }
}
class Callings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Shapes obj1 = new Shapes();
        obj1.getArea();
        int ll = sc.nextInt();
        int bb = sc.nextInt();
        int hh = sc.nextInt();
        Rectangle obj2 = new Rectangle();
        obj2.l = ll;
        obj2.b = bb;
        obj2.getArea();        
        Box obj3 = new Box();
        obj3.l = ll;
        obj3.b = bb;
        obj3.h = hh;
        obj3.getArea();
        
    }
}
