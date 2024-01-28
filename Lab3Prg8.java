import java.util.*;
import java.io.*;
public class Lab3Prg8
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
        Lab3Prg8 obj = new Lab3Prg8();
        obj.solve(arr);
    }
    void solve(int[] arr)
    {
        int l = arr.length;
        int index = -1;
        int lsum = 0;
        int rsum = 0;
        int sum = 0;
        for(int i=1; i<l; i++)
        {
            lsum = sum(arr,0,i-1);
            rsum = sum(arr,i+1,l-1);
            if(lsum==rsum)
            {
                index = i;
                break;
            }            
        }
        if(index==-1)
            System.out.println("No valid index");
        else
            System.out.println("Equilibrium Point is at : " + (index+1));
    }
    static int sum(int arr[], int i, int j)
    {
        int s = 0;
        for(int k = i; k<=j; k++)
        {
            s = s+arr[k];
        }
        return s;
    }
}
