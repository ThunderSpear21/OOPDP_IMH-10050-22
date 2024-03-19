import java.util.*;
class minmax
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ArrayList size");
        int n = sc.nextInt();
        ArrayList<Integer>arr1 = new ArrayList();
        System.out.println("Enter ArayList elements");
        for(int i = 0; i<n; i++)
        {
            arr1.add(sc.nextInt());
        }
        int min = Collections.min(arr1);
        int max = Collections.max(arr1);
        System.out.println("Min and Max are :");
        System.out.println(min + " " + max);
        System.out.println("Enter element to be removed");
        Integer t = sc.nextInt();
        arr1.remove(t);
        System.out.println("ArrayList elements are :");
        for(int i = 0; i<n-1; i++)
        {
            System.out.println(arr1.get(i));
        }
    }
}