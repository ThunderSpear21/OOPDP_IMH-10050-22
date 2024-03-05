import java.util.*;
class TheCircle
{
    double radius;
    TheCircle(double a)
    {
        radius  = a;
    }
    double area()
    {
        return Math.PI*radius*radius;
    }
    void set_width()
    {
        
    }
    void perimeter()
    {
        
    }
    void circumference()
    {
        
    }
}
class TheCylinder extends TheCircle
{
    double height;
    TheCylinder(double a, double b)
    {
        super(a);
        height = b;
    }
    void volume()
    {
        double base = area();
        System.out.println("Area :" + base);
        double vol = base*height;
        System.out.println("Volume :" + vol);
    }
}
class theeCall
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        double r = sc.nextDouble();
        double h = sc.nextInt();
        TheCylinder obj = new TheCylinder(r,h);
        obj.volume();
    }
}