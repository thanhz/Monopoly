
/**
 * Write a description of class BuyCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuyCommand
{
    private Player player;
    private Squares square;
    /**
     * Constructor for objects of class BuyCommand
     */
    public BuyCommand(int cost)
    {        
        player.addMoney(-cost);
        Squares temp = square.getSquare();
        player.buy(temp);
        System.out.println(player.getName() + " Just bought " + temp.getSquare());
    }
    
    public void execute()
    {
        
    }
}
