import java.util.*;
class Lab6Prg6
{
    public static void main(String[] args)
    {
        wrapping obj = new wrapping('A');
        System.out.println(obj.value);
    }
}
class wrapping
{
    int value;
    wrapping(char ch)
    {
        value = (int)ch;
    }
}
