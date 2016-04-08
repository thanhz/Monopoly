
/**
 * This is the square all players start on. Passing go will give the player 200 money
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public class GO extends Squares
{
       
    public GO(String name)
    {
        super(name);
    }
    
    public void doAction(Player player)
    {
        System.out.println("I AM HOME");
    }
    
    public String toString()
    {
        return super.toString()
        + "\n";
    }
}
