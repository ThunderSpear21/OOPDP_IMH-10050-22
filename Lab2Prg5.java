import java.util.*;
public class Lab2Prg2 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements :");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            
        }
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
