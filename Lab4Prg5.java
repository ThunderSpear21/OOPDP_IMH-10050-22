import java.util.*;

class Area
{
    int l,b,area;
    Area(int... a)
    {
        if(a.length==2)
        {
            l = a[0];
            b = a[1];
        }
        else
        {
            l = a[0];
        }
    }
    Area()
    {
        l = 0;
        b = 0;
        area = 0;
    }
    void compute()
    {
        if(b==0)
            area = l*l;
        else
            area = l*b;
    }
    void display()
    {
        System.out.println("Area is : "+ area);
    }
    public static void main(String[] args)
    {
        Area obj1 = new Area(10);
        Area obj2 = new Area(8,9);
        Area obj3 = new Area();
        obj1.compute();
        obj1.display();
        obj2.compute();
        obj2.display();
        obj3.compute();
        obj3.display();
    }
}