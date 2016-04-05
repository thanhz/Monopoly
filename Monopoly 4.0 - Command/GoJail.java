
/**
 * Write a description of class GotoJail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoJail extends Squares
{
    //set player state to jail and move player to jail
    public GoJail(String name)
    {
        super(name);
    }

    public void doAction()
    {
        System.out.println("GO TO JAIL FOOL");
        //new GoJailCommand();
    }

    public String toString()
    {
        return super.toString()
        + "\n";
    }
}
