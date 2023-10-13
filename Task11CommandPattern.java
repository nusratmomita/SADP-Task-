/*Senerio :-
Rajib wants to build a bus system app.For that he needs to know all the location as needed.But it is quite tough to gather all the location by himself.
Now the solutoin is to use an API.He decides to use Google map's API.This API will work like a intermidate and this will provide him all the informations he needs.
Now what kind of Design Pattern does Rajib should follow to implement his App??
*/

import java.util.ArrayList;
import java.util.List;

interface Command
{
    void execute();
}

class Map
{
    public void OneWay()
    {
        System.out.println("One way info given Google Map API.");
    }

    public void TwoWay()
    {
        System.out.println("Two way info given Google Map API.");
    }
}

class Developer1 implements Command
{
    private Map map;

    public Developer1(Map map)
    {
        this.map = map;
    }

    @Override
    public void execute()
    {
        map.OneWay();
    }
}

class Developer2 implements Command
{
    private Map map;

    public Developer2(Map map)
    {
        this.map = map;
    }

    @Override
    public void execute()
    {
        map.TwoWay();
    }
}

class GoogleMapApi
{
    private List<Command> requirements = new ArrayList<>();

    public void takeCommand(Command command)
    {
        requirements.add(command);
    }

    public void submitCommand()
    {
        for(Command command : requirements)
        {
            command.execute();
        }
        requirements.clear();
    }
}
public class Task11CommandPattern 
{
    public static void main(String[] args) {
        
    
    Map m = new Map();

    Command dev1 = new Developer1(m);
    Command dev2 = new Developer2(m);

    GoogleMapApi order = new GoogleMapApi();

    order.takeCommand(dev1);
    order.takeCommand(dev2);

    order.submitCommand();
    }
        
    
}
