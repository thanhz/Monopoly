
/**
 * This is the square all players start on. Passing go will give the player 200 money
 * 
 * @author (Tri Lam)
 * @version (7.0)
 */
public class GO extends Squares
{
       
    public GO(String name)
    {
        super(name);
    }
    
    public void doAction(Player player)
    {
        System.out.println(player.getName()+ " landed on " + getName()+ " Collect 200 " + "\n");
        player.addMoney(200);        
    }
    
    public String toString()
    {
        return super.toString()
        + "\n";
    }
}
