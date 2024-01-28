import java.util.*;
public class Lab2Prg4 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Partition Index");
        int part = sc.nextInt();
        int arr1[] = new int[part];
        int arr2[] = new int[n-part];
        int l1 = 0, l2=0;
        for(int i=0; i<n; i++)
        {
            if(i<part)
            {
                arr1[l1++] = arr[i];
            }
            else
            {
                arr2[l2++] = arr[i];
            }
        }
        Lab2Prg4 obj = new Lab2Prg4();
        System.out.println("For 1st Partition :");
        obj.duplicate(arr1);
        System.out.println("For 2nd Partition :");
        obj.duplicate(arr2);
        
    }
    public static void duplicate(int arr[])
    {
        int n = arr.length;
        int min = arr[0], max = arr[0];
        for(int i = 0; i<n; i++)
        {
            if(max<arr[i])
                max = arr[i];
            if(min>arr[i])
                min = arr[i];
            
        }
        int freq[] = new int[max+1];
        for(int i=0; i<max+1; i++)
        {
            freq[i] = 0;
        }
        for(int i=0; i<n; i++)
        {
            freq[arr[i]]++;
        }
        for(int i=0; i<=max; i++)
        {
            if(freq[i]!=0)
            {
                System.out.println("The freq of "+ i+ " in the array = "+ freq[i]);
            }
        }
    }
}
