import java.util.*;
import java.io.*;
import java.lang.*;
public class Lab3Prg4
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Lab3Prg4 obj = new Lab3Prg4();
        obj.function("Hello World");
    }
    void function(String s)
    {
        int l = s.length();
        String low = "";
        for(int i=0; i<l; i++)
        {
            int ch = s.charAt(i);
            if(ch>='A' && ch<='Z')
                ch = ch - (int)'A' + (int)'a';
            char c = (char)ch;
            low = low + c;
        }
        System.out.println(low);
        System.out.println("String length is : " + l);
    }
}
