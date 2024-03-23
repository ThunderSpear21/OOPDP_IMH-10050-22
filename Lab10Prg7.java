import java.util.*;
class InvalidAge extends Exception
{
    public String toString()
    {
        return  "Exception in InvalidAge";
    }
}
class userdefined
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try
        {
            check(n);
        }
        catch(InvalidAge e)
        {
            System.out.println(e);
        }
    }
    static void check(int age) throws InvalidAge
    {
        if(age<0)
            throw new InvalidAge();
    }
}