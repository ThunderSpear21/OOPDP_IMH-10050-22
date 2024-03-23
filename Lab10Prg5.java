import java.util.*;
class nested
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try
        {
            try
            {
                System.out.println(a/b);
            }
            catch(Exception e)
            {
                System.out.println("Division by zero in b");        
            }
            System.out.println(b/a);
        }
        catch(Exception e)
        {
            System.out.println("Division by zero in a");         
        }
    }
}