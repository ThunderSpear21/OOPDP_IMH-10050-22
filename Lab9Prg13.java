import java.lang.*;
import java.util.*;
class commonstr
{
    public static void main(String[] args)
    {
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();
        String str3,str4;
        if(str1.length()<str2.length())
        {
            str3 = str1;
            str4 = str2;
        }
        else
        {
            str3 = str2;
            str4 = str1;
        }
        int c = 0;
        for(int i =0; i<str3.length(); i++)
        {
            for(int j = i+2; j<str3.length(); j++)
            {
                String str = str3.substring(i,j);
                if(str4.contains(str))
                {
                    System.out.println(str);
                    c = 1;
                    break;
                }
            }
            if(c==1)
                break;
        }
        if(c==0)
            System.out.println("No common");
    }
}