import java.util.*;
class exce
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        try
        {
            for(int i = 0; i<n; i++)
            {
                System.out.println((float)arr[i]/arr[i+1]);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by 0");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Accessing invalid memory");
        }
    }
}