import java.util.*;
class Lab4Prg2
{
    public static void main(String[] args)
    {
        Car obj = new Car();
        String name = obj.getBrand();
        System.out.println(name);
    }
}
class Car
{
    String brand;
    Scanner sc = new Scanner(System.in);
    Car()
    {
        brand = "Ford";
    }
    public String getBrand()
    {
        return brand;
    }
}
