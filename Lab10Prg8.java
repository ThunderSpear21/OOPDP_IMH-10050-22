import java.util.*;
class nest
{
    static void method1()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
            if(b==0)
                throw new ArithmeticException();
            System.out.println(a/b);
        
    }
    static void method2()
    {
        try
        {
            method1();
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Illegal Input");
        }
    }
    static void method3()
    {
        method2();
        
    }
    public static void main(String[] args)
    {
        try
        {
            method3();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator is 0");
        }
        
            
    }
}