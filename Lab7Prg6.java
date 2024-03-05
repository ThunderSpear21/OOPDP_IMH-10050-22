import java.util.*;
class person
{
    String name;
    int age;
    void display()
    {
        System.out.println("In person display");
    }
    static void show()
    {
        System.out.println("In show person");
    }
}
class student extends person
{
    int roll,marks;
    void display()
    {
        System.out.println("In student display");
    }
    static void show()
    {
        System.out.println("In show student");
    }
}
class employee extends person
{
    int salary;
    class shadow
    {
        void display()
        {
            System.out.println("Inside inner shadow");
        }
    }
    void display()
    {
        System.out.println("Inside Outer Shadow");
    }
}
class TheCalls
{
    public static void main(String[] args)
    {
        person p1 = new person();
        person p2 = new student();
        p2.display();
        p1.show();
        p2.show();
        employee obj = new employee();
        employee.shadow objinner = obj.new shadow();
        obj.display();
        objinner.display();
        
    }
}