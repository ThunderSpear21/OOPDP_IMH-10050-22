import java.util.*;
class TheShape
{
    int getArea()
    {
        return 0;
    }
}
class TheRectangle extends TheShape
{
    int length,width;
    TheRectangle(int l, int b)
    {
        length = l;
        width = b;
    }
    int getArea()
    {
        return length*width;
    }
    
}
class TheBox extends TheRectangle
{
    int height;
    TheBox(int l, int b, int h)
    {
        super(l,b);
        height = h;
    }
    int getArea()
    {
        return 2*(length*width + width*height + height*length);
    }
}
class mecall
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        TheShape obj1 = new TheShape();
        TheRectangle obj2 = new TheRectangle(l,b);
        TheBox obj3 = new TheBox(l,b,h);
        int a1 = obj1.getArea();        
        int a2 = obj2.getArea();
        int a3 = obj3.getArea();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}