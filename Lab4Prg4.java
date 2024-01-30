import java.util.*;
class Lab4Prg4
{
    public static void main(String[] args)
    {
        Students obj1 = new Students(50,"Yash",9,8,7,6,5);
        obj1.average();
        Students obj2 = new Students(55,"Ayushi",9,8,7,6,11);
        obj2.average();
        Students obj3 = new Students(52,"Satyam",5,8,7,6,5);
        obj3.average();
    }
}
class Students
{
    int student_roll;
    String student_name;
    int m1,m2,m3,m4,m5;
    Students(int r, String s, int a1, int a2, int a3, int a4, int a5)
    {
        student_roll = r;
        student_name = s;
        m1 = a1;
        m2 = a2;
        m3 = a3;
        m4 = a4;
        m5 = a5;
    }
    void average()
    {
        System.out.println("Average of "+ student_name+ "is : " + (m1+m2+m3+m4+m5)/5.0);
    }
}