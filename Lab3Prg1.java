import java.util.*;
import java.io.*;
class Lab3Prg1
{
    static Scanner sc = new Scanner(System.in);
    int area(int a, int b)
    {
        return a*b;
    }
    int area(int a)
    {
        return a*a;
    }
    float area(float a)
    {
        return a*a*(float)Math.PI;
    }
    int perimeter(int a, int b)
    {
        return 2*(a+b);
    }
    int perimeter(int a)
    {
        return 4*a;
    }
    float perimeter(float a)
    {
        return 2*a*(float)Math.PI;
    }
    public static void main(String[] args)
    {
        Lab3Prg1 obj = new Lab3Prg1();
        System.out.println("Area of Rectangle with side 5 and 7 is " + obj.area(5,7));
        System.out.println("Area of Square with side 9 is " + obj.area(9));
        System.out.println("Area of Circle with radius 4.5 is " + obj.area(4.5f));
        System.out.println("Perimeter of Rectangle with side 5 and 7 is " + obj.perimeter(5,7));
        System.out.println("Perimeter of Square with side 9 is " + obj.perimeter(9));
        System.out.println("Perimeter of Circle with radius 4.5 is " + obj.perimeter(4.5f));
    }
}