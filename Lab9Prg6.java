import java.lang.*;
import java.util.*;
class rem0
{
    public static void main(String[] args)
    {
        String str1;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        int i = 0;
        while(str1.charAt(i)=='0')
        {
            i++;
        }
        str1 = str1.substring(i);
        System.out.println(str1);
    }
}