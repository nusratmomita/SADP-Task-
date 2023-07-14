class User 
{
    public void login(String username, String password) 
    {
        System.out.println("Enter your name and password");

    }

}

class EmailService 
{
    public void sendEmail(String to, String subject, String boby) {
        System.out.println("\nWrite your email here : ");

    }

}

public class Task1 
{

    public static void main(String[] args) {
        User us = new User();
        us.login(null, null);

        EmailService es = new EmailService();
        es.sendEmail(null, null, null);

    }
}

