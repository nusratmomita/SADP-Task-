public class Task2 
{
    public static void main(String[] args) 
    {
        // varible declaration
        int m = 10;

        System.out.println(m);

        // object creation
        ObjectCreation ob = new ObjectCreation();
        ob.display();

        // Access Modifier
        A obj = new A();
        // System.out.println(obj.a); // complie error
        obj.display1();
        obj.display2();

        // Methods with parameters
        MWP name = new MWP();
        name.mymethod("nusrat");

        // Inheritance
        Subclass info = new Subclass();
        info.display3();
    }
}

// object creation
class ObjectCreation 
{
    public void display() 
    {
        int n = 20;
        System.out.println(n);
    }

}

// Access Modifier
class A {
    private int a = 40;

    protected void display1() 
    {
        System.out.println("Protected-Access Modifier");
    }

    public void display2() 
    {
        System.out.println("Public-Access Modifier");
    }

}

// Methods with parameters
class MWP {
    public static void mymethod(String name) 
    {
        System.out.println(name);
    }
}

// Inheritance
class Addition 
{
    // int i = 10;
    char ch = 'a';

}

class Subclass extends Addition 
{
    // int j = 20;
    char ch1 = 'b';

    void display3() {
        System.out.println(ch + "," + ch1);
    }
}
