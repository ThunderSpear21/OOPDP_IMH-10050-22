import java.lang.*;
import java.util.*;
class palcat
{
    public static void main(String[] args)
    {
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();
        boolean s1 = checkpal(str1);
        boolean s2 = checkpal(str2);
        if(s1)
            System.out.println("String 1 is a Palindrome");
        if(s2)
            System.out.println("String 2 is a Palindrome");
        String ans = str1+str2;
        System.out.println(ans);            
    }
    static boolean checkpal(String str)
    {
        for(int i = 0; i<str.length()/2; i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
                return false;
        }
        return true;
    }
}