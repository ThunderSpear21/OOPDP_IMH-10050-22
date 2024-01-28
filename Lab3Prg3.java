import java.util.*;
import java.io.*;
public class Lab3Prg3
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Lab3Prg3 obj = new Lab3Prg3();
        obj.function(1,2,3,4,5,6);
        // obj.function(1,2,3,4,5.5);
    }
    void function(int...a)
    {
        int l = a.length;
        System.out.println("Total number of arguments is : " + l);
        int max = a[0];
        int sum = 0;
        for(int i=0; i<l;i++)
        {
            sum = sum + a[i];
            if(a[i]>max)
            {
                max = a[i];
                
            }
        }
        System.out.println("Maximum of the given arguments is : " + max);
        System.out.println("The sum of givenarguments is : " + sum);
        
    }
}
