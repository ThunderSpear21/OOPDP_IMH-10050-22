import java.util.*;
import java.io.*;
import java.lang.*;
class Lab3Prg5
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Lab3Prg5 obj = new Lab3Prg5();
        obj.function(new int[]{1,2,3,4,5});
    }
    void function(int a[])
    {
        int sum=0;
        for(int i=a.length-1; i>=0; i--)
        {
            sum = sum + a[i];
            System.out.print(a[i] + "\t");
        }
        System.out.println("\nSum is : "+ sum);
    }
}
