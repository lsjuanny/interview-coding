public class Test
{
    public static void main(String[] args)
    {
        Fruit fruit=new Fruit();
        Fruit apple=new Apple();
        fruit.printColor();
        apple.printColor();
    }
}

class Apple extends Fruit
{
    Apple()
    {
        System.out.println("Construct apple");
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
        System.out.println("Construct fruit");
    }

    // final void printColor() 
    void printColor()
    {
        System.out.println(String.format("I'm Fruit. My color is %s", color));
    }
}