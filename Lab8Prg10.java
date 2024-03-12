interface outerint
{
    void f1();
    interface innerint
    {
        void f2();
    }
}
class d implements outerint,outerint.innerint
{
    public void f1()
    {
        System.out.println("In f1 outer interface");
    }
    public void f2()
    {
        System.out.println("In f2 inner interface");
    }
}
class c
{
    public static void main(String[] args)
    {
        outerint o1 = new d();
        o1.f1();
        outerint.innerint o2 = new d();
        o2.f2();
        
    }
}