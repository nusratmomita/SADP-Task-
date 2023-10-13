/* Senerio :-
We use Youtube for verious reasons.We can do many operations inside this video sharing app.
If one youtuber has uploaded a video,his subscriber will get notification if they subscribed
to his channel or otherwise.Implement a design pattern suits this situation to update all the 
users of this application.
*/

import java.util.ArrayList;
import java.util.List;

interface Subject
{
    void Subscribtion(Observer Oberserver);
    void Unsubcribed(Observer observer);
    void Notify(String video);
}

class Youtubers implements Subject
{
    private String user;
    private List<Observer> followers;
    private String post;

    public Youtubers(String username)
    {
        this.user = username;
        this.followers = new ArrayList<>();
    }

    public void videoUpdate(String video)
    {
        post = video;
        Notify(video);
    }

    @Override
    public void Subscribtion(Observer observer)
    {
        followers.add(observer);
    }

    @Override
    public void Unsubcribed(Observer observer)
    {
        followers.remove(observer);
    }

    @Override
    public void Notify(String video)
    {
        for(Observer follower : followers)
        {
            follower.update(user,video);
        }
    }

    
}

interface Observer
{
    void update(String user,String video);
}

class YoutubeUser implements Observer
{
    private String User;

    public YoutubeUser(String user)
    {
        this.User = user;
    }

    @Override
    public void update(String username,String post)
    {
        System.out.println(User+",New video is uploaded by "+username+":");
        System.out.println(post);
        System.out.println();
    }
    
}

public class Task10ObserverPattern
{
    public static void main(String[] args) 
    {
        Youtubers Alice = new Youtubers("Alice");
        Youtubers Bob = new Youtubers("Bob");

        YoutubeUser user1 = new YoutubeUser("user1");
        YoutubeUser user2 = new YoutubeUser("user2");

        Alice.Subscribtion(user1);
        Alice.Subscribtion(user2);
        Bob.Subscribtion(user2);

        Alice.videoUpdate("New Editing Video is uploaded");
        Bob.videoUpdate("New Video is uploaded");

        Alice.Unsubcribed(user2);

        Alice.videoUpdate("Last uploaded video is updated!");



        

    }
}