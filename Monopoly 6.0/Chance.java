
/**
 * A bunch of random events that can happen to a player if they land on the square
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public class Chance extends Squares
{
    private int cNumber;
    //arraylist of Cards
    public Chance(String name)
    {
        super(name);
    }

    public void doAction(Player player)
    {
        System.out.println("ITS TIME TO DU DU DU DUEAL!");
    }

    public String toString()
    {
        return super.toString()
        +"\n";
    }
}
