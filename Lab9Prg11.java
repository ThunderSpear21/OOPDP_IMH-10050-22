import java.lang.*;
import java.util.*;
class checkend
{
    public static void main(String[] args)
    {
        String str1,str2,str3;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();
        str3 = sc.next();
        int l = str3.length();
        if(str1.substring(str1.length()-l).equals(str3))
            System.out.println("Str1 contains Str3");
        else
            System.out.println("Str1 does not contain Str3");
        if(str2.substring(str2.length()-l).equals(str3))
            System.out.println("Str2 contains Str3");
        else
            System.out.println("Str2 does not contain Str3");
    }
}