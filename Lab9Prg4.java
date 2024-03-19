import java.lang.*;
import java.util.*;
class anagram
{
    public static void main(String[] args)
    {
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();
        str1.toLowerCase();
        str2.toLowerCase();
        int f1[] = new int[26];
        int f2[] = new int[26];
        for(int i = 0; i<str1.length(); i++)
        {
            int x = str1.charAt(i) - 97;
            f1[x]++;
        }
        for(int i = 0; i<str1.length(); i++)
        {
            int x = str2.charAt(i) - 97;
            f2[x]++;
        }
        int c = 0;
        for(int i =0; i<26; i++)
        {
            if(f1[i]==f2[i])
                c++;
        }
        if(c==26)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}