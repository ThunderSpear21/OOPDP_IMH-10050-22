import java.util.*;
import java.io.*;
public class Lab3Prg9
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Lab3Prg9 obj = new Lab3Prg9();
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for(int i =0; i<n; i++)
            arr[i] = sc.nextInt();
        obj.solve(arr);
    }
    void solve(int arr[])
    {
        int l = arr.length;
        int count = 0;
        for(int i=0; i<l-1; i++)
        {
            for(int j=i+1; j<l; j++)
            {
                if(arr[j]<arr[i])
                    count++;
            }
        }
        System.out.println("Inversion Count is :" + count);
    }
}