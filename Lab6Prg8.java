import java.util.*;
class Circle
{
    double radius;
    
    double area()
    {
        return 3.14*radius*radius;
    }
    void set_width()
    {
        System.out.println("In Set_width");
    }
    void perimeter()
    {
        System.out.println("In Perimeter");
    }
    void circumference()
    {
        System.out.println("In Circumference");
    }
    
}
class Cylinder extends Circle
{
    double height;
    Scanner sc = new Scanner(System.in);
    void set_width()
    {
        System.out.println("Enter Base Radius");
        radius = sc.nextDouble();
    }
    void set_height()
    {
        System.out.println("Enter Height");
        height = sc.nextDouble();
    }
    void volume()
    {
        set_width();
        set_height();
        double ar = area();
        System.out.println("Area is :" + ar);
        double volume = ar*height;
        System.out.println("Volume is :" + volume);
    }
}
class DriverCall
{
    public static void main(String[] args)
    {
        Cylinder obj = new Cylinder();
        obj.volume();
        
    }
}