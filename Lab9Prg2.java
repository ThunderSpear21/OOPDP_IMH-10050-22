import java.util.*;
class mergeal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ArayList size");
        int n = sc.nextInt();
        ArrayList<Integer>arr1 = new ArrayList();
        ArrayList<Integer>arr2 = new ArrayList();
        ArrayList<Integer>arr3 = new ArrayList();
        ArrayList<Integer>arr4 = new ArrayList();
        ArrayList<Integer>arr5 = new ArrayList();
        System.out.println("Enter ArayList1 elements");
        for(int i = 0; i<n; i++)
        {
            arr1.add(sc.nextInt());
            arr3.add(arr1.get(i));
        }
        System.out.println("Enter ArayList2 elements");
        for(int i = 0; i<n; i++)
        {
            arr2.add(sc.nextInt());
            arr4.add(arr2.get(i));
        }
        Collections.sort(arr1);
        Collections.sort(arr2);
        int c = 0;
        for(int i = 0; i<n; i++)
        {
            if(arr1.get(i)==arr2.get(i))
                c++;
        }
        if(c==n)
            System.out.println("Both ArrayList are equal");
        else
            System.out.println("Both ArrayLIst are not equal");
        for(int i = 0; i<n; i++)
        {
            arr5.add(arr3.get(i));
        }
        for(int i = 0; i<n; i++)
        {
            arr5.add(arr4.get(i));
        }
        System.out.println("Merged ArrayList :");
        for(int i = 0; i<2*n; i++)
        {
            System.out.print(arr5.get(i) + " ");
        }
        
    }
}