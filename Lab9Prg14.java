import java.lang.*;
import java.util.*;
class primsec
{
    public static void main(String[] args)
    {
        String prim,secnd;
        Scanner sc = new Scanner(System.in);
        prim = sc.next();
        secnd = sc.next();
        if(prim.contains(secnd))
        {
            String s = sc.next();
            prim = s;
        }
    }
}