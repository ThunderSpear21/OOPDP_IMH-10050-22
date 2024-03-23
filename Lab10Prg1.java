import java.util.*;
class gco
{
    public void finalize()
    {
        System.out.println("Object is collected");
    }
    public static void main(String[] args)
    {
        gco obj1 = new gco();
        gco obj2 = new gco();
        gco obj3 = new gco();
        gco obj4 = new gco();
        obj1 = obj2;
        obj3 = null;
        obj4 = null;
        System.gc();
    }
}