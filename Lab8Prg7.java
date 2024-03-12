interface intone
{
    void m1();//{};
    default void common1()
    {
        System.out.println("In m1 default");
    }
}
interface inttwo
{
    void m2();
    default void common2()
    {
        System.out.println("In m2 default");
    }
}
class childs implements intone,inttwo
{
    public void m1()
    {
        System.out.println("In m1");
    }
    public void m2()
    {
        System.out.println("In m2");
    }
    public void invoke()
    {
        common1();
        common2();
    }
}
class helpers
{
    public static void main(String[] args)
    {
        childs obj1 = new childs();
        obj1.common1();
        obj1.common2();
        obj1.invoke();
    }
}