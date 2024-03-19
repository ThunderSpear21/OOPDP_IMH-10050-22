import java.lang.*;
import java.util.*;
class rev
{
    public static void main(String[] args)
    {
        String str1,str2;
        str2 = "";
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        for(int i = str1.length()-1; i>=0; i--)
        {
            str2 = str2 + str1.charAt(i);
        }
        System.out.println(str2);
    }
}