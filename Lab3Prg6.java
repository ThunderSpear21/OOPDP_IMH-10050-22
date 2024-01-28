import java.util.*;
import java.io.*;
public class Lab3Prg6
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Lab3Prg6 obj = new Lab3Prg6();
        obj.display((byte)1);
        obj.display((short)1);
        obj.display((int)1);
        obj.display((char)111);
        // obj.display((long)1);
        // obj.display((float)1);
    }
    void display(int a)
    {
        System.out.println(a);
    }
}
