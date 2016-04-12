
/**
 * This is a jail sqaure players who land on here via stepping on go to jail square or via chance/community
 * will be held here for 3 goes or if they pay £50.
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public class Jail extends Squares
{
    private int turns;
    //put a state injail in player class
    
    public Jail(String name)
    {
        super(name);
    }
    
        public void doAction(Player player)
    {
        System.out.println("I AM JUST VISITING JAIL:(");
    }
    
}
