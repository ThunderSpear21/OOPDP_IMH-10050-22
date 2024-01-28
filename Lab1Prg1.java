import java.util.*;
import java.math.*;
public class Lab1Prg1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter your name");
        str = sc.next();
        System.out.println("Enter 2 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Username : " + str);
        System.out.println("Sum of the input are : " + (a+b));
        System.out.println("Difference of the input are : " + (a-b));
        System.out.println("Product of the input are : " + (a*b));
        System.out.println("Integral Divison of the input are : " + (a/b));
        System.out.println("Modulo of the input are : " + (a%b));
        float c = a;
        System.out.println("Real Divison of the input are : " + ((float)a/b));
        
    }
}
