import java.util.*;
class Lab4Prg1
{
    public static void main(String[] args)
    {
        
        Employee obj = new Employee();
        obj.set();
        obj.get();
        //System.out.println("Under private access : "+obj.Employee_id);
        //System.out.println("Under protected access : "+obj.Employee_name);
        //System.out.println("Under default access : "+obj.Employee_department);
    }
}
class Employee
{
    private int Employee_id;
    protected String Employee_name;
    String Employee_department;
    Scanner sc = new Scanner(System.in);
    
    public void set()
    {
        System.out.println("Enter Employee ID, Name and Department");
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        Employee_id = n;
        Employee_name = s1;
        Employee_department = s2;
    }
    public void get()
    {
        System.out.println("Employee Id : " + Employee_id);
        System.out.println("Employee Name : " + Employee_name);
        System.out.println("Employee Department : " + Employee_department);
    }
}

