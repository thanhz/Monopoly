
/**
 * Abstract class Spaces - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
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
    
    public abstract void doAction(); //Overwritten by subclasses
    
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
