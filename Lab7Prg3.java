import java.util.*;
class TheRectangles
{
    int length,breadth;
    TheRectangles()
    {
        length = 1;
        breadth = 1;
    }
    TheRectangles(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    
}
class TheCuboid extends TheRectangles
{
    int height;
    TheCuboid()
    {
        height = 1;
    }
    TheCuboid(int height)
    {
        this.height = height;
    }
    int volume()
    {
        return length*breadth*height;
    }
}
class callssss
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        TheCuboid obj = new TheCuboid();
        System.out.println(obj.volume());
        int x = sc.nextInt();
        TheCuboid obj2 = new TheCuboid(x);
        System.out.println(obj2.volume());
        
    }
}