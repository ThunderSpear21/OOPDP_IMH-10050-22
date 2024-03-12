import java.util.*;
class Out 
{
    void methodout() 
    {
        System.out.println("Inside Outer Class Method");
    }
    static class In 
    {
        static void methodin() 
        {
            System.out.println("Inside Inner Class Method");
        }
    }

}

class Called 
{
    public static void main(String[] args) 
    {
        Out obj1 = new Out();
        obj1.methodout();
        Out.In.methodin();
    }
}
