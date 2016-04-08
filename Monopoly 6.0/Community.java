
/**
 * A bunch of random events that can happen to a player if they land on the square
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public class Community extends Squares
{
    private int cNumber;
    //Arraylist of cards
    public Community(String name)
    {
        super(name);       
    }
    
    public void doAction(Player player)
    {
        System.out.println("IT'S TIME TO DU DU DU DUEAL");
    }
    
    public String toString()
    {
        return super.toString()
        +"\n";
    }
}
