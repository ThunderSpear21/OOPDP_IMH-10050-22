import java.util.*;
import java.io.*;
public class Lab3Prg7
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for(int i =0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter value of key");
        int k = sc.nextInt();
        Lab3Prg7 obj = new Lab3Prg7();
        obj.solve(arr,k);
    }
    void solve(int[] arr, int k)
    {
        int count = 0;
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j =i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j]==k)
                    count++;
            }
        }
        System.out.println(count);
    }
}
