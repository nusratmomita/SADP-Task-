class Context
{
    private IStrategy strategy;

    public Context(IStrategy strategy)
    {
        this.strategy = strategy;
    }

    public int result(int a , int b)
    {
        return strategy.doOperation(a,b);
    }
}

interface IStrategy
{
    int doOperation(int x , int y);
}

class Shape1 implements IStrategy
{
    @Override
    public int doOperation(int w , int h)
    {
        double c = .5;
        return (int) (c * (w * h));
    }
}

class Shape2 implements IStrategy
{
    @Override
    public int doOperation(int a, int b)
    {
        return a * b;
    }

}

public class StrategyPattern
{
    public static void main(String[] args) 
    {
        Context c = new Context(new Shape1());
        System.out.println(c.result(2,2));
    }
}
