import java.lang.*;
import java.util.*;
class customcmp
{
    public static void main(String[] args)
    {
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();
        int c = 0;
        for(int i = 0; i<str1.length(); i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                c++;
                if(str1.charAt(i)-str2.charAt(i)>0)
                    System.out.println("+ve");
                else
                    System.out.println("-ve");
            }
        }
        if(c==0)
            System.out.println(0);
    }
}