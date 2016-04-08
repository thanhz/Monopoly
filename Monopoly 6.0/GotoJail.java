
/**
 * Landing on this square a player will be sent directly to the jail Square
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public class GotoJail extends Squares
{
    //set player state to jail and move player to jail
    public GotoJail(String name)
    {
        super(name);
    }

    public void action()
    {

    }

    public void doAction(Player player)
    {
        System.out.println("GO TO JAIL YOU BAD PERSON");
        player.setLocation(10);
        player.setJail(true);
    }

    public String toString()
    {
        return super.toString()
        + "\n";
    }
}
