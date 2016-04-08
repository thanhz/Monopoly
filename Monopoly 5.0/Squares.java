
/**
 * Abstract class Spaces - This is the parent class which all the squares you can land on the game will
 * inherit from.
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public abstract class Squares
{
    private String name;
    //private boolean owned;
    public Squares(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public abstract void doAction(Player player); //Overwritten by subclasses
    
    public Squares getSquare()
    {
        return this;
    }
    
    //public boolean isOwned()

    public String toString()
    {
        return "\nName: " + name;
    }
}
