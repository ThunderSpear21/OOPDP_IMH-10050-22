import java.util.*;
class Students
{
    String Student_name;
    int Student_roll;
    int Student_fee;
    static Scanner ss = new Scanner(System.in);
    Students()
    {
        this("Yash",10,1010);        
    }
    Students(String Student_name, int Student_roll, int Student_fee)
    {
        this.Student_name = Student_name;
        this.Student_roll = Student_roll ;
        this.Student_fee = Student_fee;
    }
    void Display(Students sss)
    {
        System.out.println(this.Student_name);
        System.out.println(this.Student_roll);
        System.out.println(this.Student_fee);
    }
    void Show()
    {
        Display(this);
    }
}
class Calls
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String ss = sc.next();
        int rr = sc.nextInt();
        int ff = sc.nextInt();
        Students obj2 = new Students(ss,rr,ff);
        Students obj1 = new Students();
        System.out.println("Student 1 Details are :");
        obj1.Show();
        System.out.println("Student 2 Details are :");
        obj2.Show();
    }
}