import java.util.*;
public class Lab4Prg3
{
    public static void main(String[] args)
    {
        Student obj1 = new Student();
        obj1.display();
        Student obj2 = new Student(10050,"Yash", 10,10,10,10,10);
        obj2.display();
    }
}
class Student
{
    int student_roll;
    String student_name;
    int m1,m2,m3,m4,m5;
    Student()
    {
        student_roll = 0;
        m1 = m2 = m3 = m4 = m5 = 0;
        student_name = "Unknown";
    }
    Student(int r, String s, int a1, int a2, int a3, int a4, int a5)
    {
        student_roll = r;
        student_name = s;
        m1 = a1;
        m2 = a2;
        m3 = a3;
        m4 = a4;
        m5 = a5;
    }
    void display()
    {
        System.out.println("Roll No. : "+student_roll);
        System.out.println("Name : "+student_name);
        System.out.println("Marks in Subject 1 : "+ m1);
        System.out.println("Marks in Subject 2 : "+ m2);
        System.out.println("Marks in Subject 3 : "+ m3);
        System.out.println("Marks in Subject 4 : "+ m4);
        System.out.println("Marks in Subject 5 : "+ m5);
    }
    
}
