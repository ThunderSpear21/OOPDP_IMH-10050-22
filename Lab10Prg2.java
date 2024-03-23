import java.util.*;
class emps
{
    int id,age;
    String name;
    static int nextid = 1;
    emps(String s, int a)
    {
        name = s;
        age = a;
        id = nextid++;
    }
    static void reduce()
    {
        nextid--;
    }
    void show()
    {
        System.out.println(id + " " + name + " " + age);
    }
    void shownextid()
    {
        System.out.println(nextid);
    }
    public void finalize()
    {
        emps.reduce();
        System.out.println("Removed");
    }
    public static void main(String[] args)
    {
        emps e1 = new emps("Yash",18);
        emps e2 = new emps("Aman",28);
        emps e3 = new emps("Kashish",38);
        e1.show();
        e1.shownextid();
        e2.show();
        e2.shownextid();
        e3.show();
        e3.shownextid();
        
            emps i1 = new emps("Karan",32);
            emps i2 = new emps("Sohail",22);
            i1.show();
            i1.shownextid();
            i2.show();
            i2.shownextid();
            i1 = null;
            i2 = null;
            System.gc();
        
        e1.shownextid();
    }
}