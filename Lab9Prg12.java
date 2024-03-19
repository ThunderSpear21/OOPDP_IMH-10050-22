import java.lang.*;
import java.util.*;
class indexalpha
{
    public static void main(String[] args)
    {
        String str1;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        for(int i = 0; i<26; i++)
        {
            /*
            for(int j = 0; j<str1.length(); j++)
            {
                if(str1.charAt(j)==(char)(i+97))
                {
                    System.out.println((char)(i+97) + " " + j);
                    break;
                }
            }*/
            System.out.println((char)(i+97) + " " + str1.indexOf((char)(i+97)));
            
        }
    }
}