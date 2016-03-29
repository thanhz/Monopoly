
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
    private boolean state;
    
    public Property(String name,int cost,int rent)
    {
        this.name = name;
        this.cost = cost;
        this.rent = rent;
        state = true;
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
    
    public boolean getState()
    {
        return state;
    }
    
    public void changeState(boolean state)
    {
        this.state = state;
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
