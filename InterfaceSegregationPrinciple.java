interface Vehicle
{
    void setPrice(double price);
}

interface Moveable
{
    void start();
    void stop();
}

interface Flyable
{
    void fly();
}

class Car implements Vehicle , Moveable
{
    double price;

    @Override
    public void setPrice(double price)
    {
        this.price  = price;
        System.out.println(price);
    }

    @Override
    public void start()
    {
        System.out.println("Starts");
    }

    @Override
    public void stop()
    {
        System.out.println("Stops");
    }
}

class Aeroplane implements Vehicle , Moveable , Flyable
{
    double price;

    @Override
    public void setPrice(double price)
    {
        this.price = price;
        System.out.println(price);
    }

    @Override
    public void start()
    {
        System.out.println("Starts");   
    }

    @Override
    public void stop()
    {
        System.out.println("Stops");
    }

    @Override
    public void fly()
    {
        System.out.println("Flys");
    }
}

public class  InterfaceSegregationPrinciple 
{
    public static Car builder()
    {
        Car c = new Car();
        c.setPrice(15.00);
        c.start();
        c.stop();

        return c;
    }


public static Aeroplane buildAeroplane()
{
    Aeroplane a = new Aeroplane();
    a.setPrice(89.00);
    a.start();
    a.stop();
    a.fly();

    return a;
}
}

class VehicleBuilder
{
    public static void main(String[] args) 
    {
          InterfaceSegregationPrinciple obj = new InterfaceSegregationPrinciple();
          System.out.println("Information of Car : ");
          obj.builder();
          System.out.println("\nInformation of Aeroplane : ");
          obj.buildAeroplane();
          //InterfaceSegregationPrinciple.builder();

    }
    
}
