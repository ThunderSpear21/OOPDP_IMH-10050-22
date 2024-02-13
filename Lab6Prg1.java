import java.util.*;
class Student
{
    String Student_name;
    int Student_roll;
    int Student_fee;
    Student(String Student_name, int Student_roll, int Student_fee)
    {
        this.Student_name = Student_name;
        this.Student_roll = Student_roll ;
        this.Student_fee = Student_fee;
    }
    void Display()
    {
        System.out.println(this.Student_name);
        System.out.println(this.Student_roll);
        System.out.println(this.Student_fee);
    }
}
class Call
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int r = sc.nextInt();
        int f = sc.nextInt();
        Student obj1 = new Student(s,r,f);
        String ss = sc.next();
        int rr = sc.nextInt();
        int ff = sc.nextInt();
        Student obj2 = new Student(ss,rr,ff);
        System.out.println("Student 1 Details are :");
        obj1.Display();
        System.out.println("Student 2 Details are :");
        obj2.Display();
    }
}