import java.util.*;
class chained
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number");
        int n = sc.nextInt();
        try
        {
            if(n<0)
                throw new IllegalArgumentException("Number should be positive");
        }
        catch(IllegalArgumentException e)
        {
            throw new RuntimeException("Invalid",e);
        }
    }
}