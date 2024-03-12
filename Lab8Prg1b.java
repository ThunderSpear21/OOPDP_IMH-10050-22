class Outers
{
    void methodouters()
    {
        System.out.println("Inside Outer Class Method");
        class Inners
        {
            void methodinners()
            {
                System.out.println("Inside Inner Class Method");
            }
        }
        Inners obj2 = new Inners();
        obj2.methodinners();
        System.out.println("Exiting Outer Class Method");
    }
}
class Calls
{
    public static void main(String[] args)
    {
        Outers obj1 = new Outers();
        obj1.methodouters();
    }
}