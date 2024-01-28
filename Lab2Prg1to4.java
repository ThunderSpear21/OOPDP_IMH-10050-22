
import java.util.*;

public class Lab2Prg1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int total = n;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter 1 for Insertion, 2 for Deletion, 3 for Searching.");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: {
                System.out.println("Enter location to insert");
                int loc = sc.nextInt();
                System.out.println("Enter value");
                int data = sc.nextInt();
                for (int i = n - 2; i >= loc; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[loc] = data;
                break;
            }
            case 2: {
                System.out.println("Enter index to be deleted");
                int loc = sc.nextInt();
                for (int i = loc; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                break;
            }
            case 3: {
                System.out.println("Enter Element to be searched");
                int search = sc.nextInt();
                int key = 0;
                for (int i = 0; i < n; i++) {s
                    if (arr[i] == search) {
                        key = 1;
                        System.out.println("Found at Index: " + i);
                        break;
                    }
                }
                if (key == 0) {
                    System.out.println("Not found");
                }
                break;
            }
            default:
                System.out.println("Invalid Input");
        }
        for (int i = 0; i < total; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
