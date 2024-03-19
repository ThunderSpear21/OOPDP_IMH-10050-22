import java.lang.*;
import java.util.*;
class cmpstr
{
    public static void main(String[] args)
    {
        String str1,str2,str3;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();
        str3 = sc.next();
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str3));
    }
}