public class Test
{
    public static void main(String[] args)
    {
        Father obj=new Child();
        System.out.println(obj.r);
        obj.printname();
    }
}

class Child extends Father
{
	int r;
    Child()
    {
        r=5;
    }
    void printname()
    {
        System.out.println("I'm Child");
    }
}
class Father
{
    int r;
    Father()
    {
        r=4;
    }
    void printname()
    {
        System.out.println("I'm father");
    }
}