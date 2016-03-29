
/**
 * Write a description of class Property here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Property 
{
    private String name;
    private int cost;
    private int rent;
    private SquareState state;
    private String type;
    
    public Property(String name,int cost,int rent)
    {
        this.name = name;
        this.cost = cost;
        this.rent = rent;
        this.state = SquareState.AVAILABLE;
        type = "property";
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public int getRent()
    {
        return rent;
    }
    
    public SquareState getState()
    {
        return state;
    }
    
    public void changeState(SquareState state)
    {
        this.state = state;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String toString()
    {
        return "\nName : " + name
        + "\nCost :" + cost
        + "\nRent :" + rent
        + "\nState :" + state
        + "\n";
    }
}
