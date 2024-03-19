import java.lang.*;
import java.util.*;
class allchar
{
    public static void main(String[] args)
    {
        String str1,ans;
        ans = "";
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        int f1[] = new int[26];
        for(int i = 0; i<str1.length(); i++)
        {
            int x = str1.charAt(i) - 97;
            f1[x]++;
        }
        for(int i = 0; i<26; i++)
        {
            if(f1[i]==0)
                ans=ans+ (char)(i+97);
        }
        if(ans=="")
            System.out.println("All alphabets are present");
        else
        {
            System.out.println("Missing alphabets are :");
            for(int i = 0; i<ans.length(); i++)
            {
                System.out.print(ans.charAt(i) + " ");
            }
        }
    }
}