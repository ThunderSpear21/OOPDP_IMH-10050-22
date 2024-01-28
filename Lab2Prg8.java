import java.util.*;
public class Lab2Prg5 
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
        System.out.println("Peak Elements are : ");
        for(int i =0; i<n-1; i++)
        {
            if(arr[i]>=arr[i+1])
                System.out.print(arr[i]+"\t");
        }
    }
}