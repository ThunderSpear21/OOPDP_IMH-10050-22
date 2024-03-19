import java.util.*;
class alstr
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList();
        ArrayList<String> strs = new ArrayList();
        System.out.println("Enter ArrayList size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter integers");
        for(int i = 0; i<n; i++)
        {
            arr.add(sc.nextInt());
        }
        System.out.println("Enter integer to insert at start");
        int t = sc.nextInt();
        arr.add(0,t);
        System.out.println("ArrayList elements are :");
        for(int i = 0; i<=n; i++)
        {
            System.out.println(arr.get(i));
        }
        System.out.println("Enter element to be removed");
        Integer x = sc.nextInt();
        arr.remove(x);
        System.out.println("ArrayList elements are :");
        Collections.sort(arr);
        for(int i = 0; i<=n-1; i++)
        {
            System.out.println(arr.get(i));
        }
        System.out.println("Enter strings");
        for(int i = 0; i<n; i++)
        {
            strs.add(sc.next());
        }
        System.out.println("ArrayList elements are :");
        for(int i = 0; i<n; i++)
        {
            System.out.println(strs.get(i));
        }
        System.out.println("Enter element to be removed");
        String str = sc.next();
        strs.remove(str);
        Collections.sort(strs);
        System.out.println("ArrayList elements are :");
        for(int i = 0; i<n-1; i++)
        {
            System.out.println(strs.get(i));
        }
    }
}