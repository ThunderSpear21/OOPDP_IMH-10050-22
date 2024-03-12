import java.util.*;
abstract class shape
{
    void area(){};
    void perimeter(){};
}
class Circle extends shape
{
    int radius;
    void area()
    {
        double a = Math.PI*radius*radius;
        System.out.println(a);
    }
    void perimeter()
    {
        double p = Math.PI*2*radius;
        System.out.println(p);
    }
}
class Rectangle extends shape
{
    int l, b;
    void area()
    {
        System.out.println(l*b);
    }
    void perimeter()
    {
        System.out.println(2*(l+b));
    }
}
class Caller
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius, Length and Breadth");
        int rr = sc.nextInt();
        int ll = sc.nextInt();
        int bb = sc.nextInt();
        Rectangle objr = new Rectangle();
        objr.l = ll;
        objr.b = bb;
        Circle objc = new Circle();
        objc.radius = rr;
        System.out.println("Rectangle Area and Perimeter :");
        objr.area();
        objr.perimeter();
        System.out.println("Circle Area and Perimeter :");
        objc.area();
        objc.perimeter();
    }
}