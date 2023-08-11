interface in
{
    void M(); 
}

public class Task7
{
    static void catchInterface(in obj)
    {
        obj.M();
    } 


public static void main(String[] args)
{
    Task7 catchInterface(new in()
    {
        public void M()
        {
            System.out.println("Hello");
        }
    });
}
}