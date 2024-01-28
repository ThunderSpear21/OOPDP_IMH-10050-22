import java.util.*;
public class Lab2Prg3 
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
        int odd[] = new int[n];
        int even[] = new int[n];
        int co = 0, ce = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
                even[ce++] = arr[i];
            else
                odd[co++] = arr[i];
        }
        System.out.println("Original Array :");
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nEven elements :");
        for(int i = 0; i<ce; i++)
        {
            System.out.print(even[i]+"\t");
        }
        System.out.println("\nOdd elements :");
        for(int i = 0; i<co; i++)
        {
            System.out.print(odd[i]+"\t");
        }
    }
}
