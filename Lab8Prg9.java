interface Helpers
{
    void func1();
}

interface ClassHelpers extends Helpers
{
    void func2();
}
class Question implements ClassHelpers
{
    public void func1()
    {
        System.out.println("In func1");
        
    }
    public void func2()
    {
        System.out.println("In func2");
    }
}
class drivers
{
    public static void main(String[] args)
    {
        Question q = new Question();
        q.func1();
        q.func2();
    }
}