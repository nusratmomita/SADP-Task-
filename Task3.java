abstract class calculateResult
{
    public abstract int result();
}

class sum extends calculateResult
{
    private int a;
    private int b;

    public sum(int a , int b)
    {
        this.a = a;
        this.b = b;
    }

    @Override

    public int result()
    {
        return a + b;
    }
}

class subtraction extends calculateResult
{
    private int a;
    private int b;

    public subtraction(int a , int b)
    {
        this.a = a;
        this.b = b;
    }

    @Override

    public int result()
    {
        return a - b;
    }
}

class multiplication extends calculateResult
{
    private int a;
    private int b;

    public multiplication(int a , int b)
    {
        this.a = a;
        this.b = b;
    }

    @Override

    public int result()
    {
        return a * b;
    }
}

class divide extends calculateResult
{
    private int a;
    private int b;

    public divide(int a , int b)
    {
        this.a = a;
        this.b = b;
    }

    @Override

    public int result()
    {
        return a / b;
    }
}
public class Task3
{
    public static void main(String[] args)
    {
        sum s = new sum(1,2);
        System.out.println(s.result());

        subtraction s1 = new subtraction(3,2);
        System.out.println(s1.result());

        multiplication s2 = new multiplication(10,20);
        System.out.println(s2.result());

        divide s3 = new divide(10,5);
        System.out.println(s3.result());
    }
}




















