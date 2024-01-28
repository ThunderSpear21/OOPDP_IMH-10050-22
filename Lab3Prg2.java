import java.util.*;
import java.io.*;
public class Lab3Prg2
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter Name and Age");
        String str = sc.next();
        int age = sc.nextInt();
        Lab3Prg2 obj = new Lab3Prg2();
        System.out.println("The Validity of the Name of the user is : " + obj.check(str));
        System.out.println("The Validity of the Age the user is : " + obj.check(age));
        
    }
    boolean check(String s)
    {
        int l = s.length();
        for(int i=0; i<l; i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                continue;
            else
                return false;
        }
        return true;
    }
    boolean check(int a)
    {
        if(a>3 && a<15)
            return true;
        else
            return false;
    }
}
