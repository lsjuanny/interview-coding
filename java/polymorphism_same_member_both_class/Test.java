public class Test
{
    public static void main(String[] args)
    {
        Fruit obj=new Apple();
        System.out.println(obj.color);
        obj.printColor();
    }
}

class Apple extends Fruit
{
	//! int color;
    Apple()
    {
        color=5;
    }
    void printColor()
    {
        System.out.println(String.format("I'm Apple and my color is %s", color));
    }
}
class Fruit
{
    int color;
    Fruit()
    {
        color=4;
    }
    void printColor()
    {
        System.out.println(String.format("I'm Fruit. My color is %s", color));
    }
}