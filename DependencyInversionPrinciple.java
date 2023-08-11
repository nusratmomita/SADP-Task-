interface Emoji
{
    void ShowEmoji();
}

class Expression
{
    private Emoji emoji;

    public Expression(Emoji emoji)
    {
        this.emoji = emoji;
    }

    public void ShowEmoji()
    {
        emoji.ShowEmoji();
    }
}

class HappyEmoji implements Emoji
{
    @Override

    public void ShowEmoji()
    {
        System.out.println("Happy :)");
    }
}

class SadEmoji implements Emoji
{
    @Override
    public void ShowEmoji()
    {
        System.out.println("Sad :(");
    }
}

public class DependencyInversionPrinciple
{
    public static void main(String[] args) 
    {
        HappyEmoji h = new HappyEmoji();
        SadEmoji s = new SadEmoji();

        Expression eh = new Expression(h);
        Expression sh = new Expression(s);

        eh.ShowEmoji();
        sh.ShowEmoji();
    }
}