import java.util.*;
interface Person
{
    int age = 18;
    String name = "Yash";
    static void dispname()
    {
        System.out.println("Interface dispname");
    }
    static void dispage()
    {
        System.out.println("Interface dispage");
    }
    void setname();
    void setage();
    
}
class employee implements Person
{
    public void setname()
    {
        System.out.println(name);
    }
    public void setage()
    {
        System.out.println(age);
    }  
}
class callers
{
    public static void main(String[] args)
    {
        Person obj = new employee();
        Person.dispage();
        Person.dispname();
        obj.setage();
        obj.setname();
        
    }
}