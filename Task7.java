interface Application
{
    void run();
}

class AndriodApp implements Application
{
    @Override

    public void run()
    {
        System.out.println("Your app is running successfully.");
    }
}

class Phone implements Application
{
    protected Application app;

    public Phone(Application app)
    {
        this.app = app;
    }

    public void run()
    {
        app.run();
    }
}

public class Task7
{
    public static void main(String[] args) 
    {
        Phone ph = new Phone(new AndriodApp());
        ph.run();
    }
}