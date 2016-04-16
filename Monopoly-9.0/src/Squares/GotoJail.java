
/**
 * Landing on this square a player will be sent directly to the jail Square
 * 
 * @author (Tri Lam)
 * @version (7.0)
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
        System.out.println(player.getName()+ " landed on " + getName() +"\n");
        player.goJail();
    }

    public String toString()
    {
        return super.toString()
        + "\n";
    }
}
