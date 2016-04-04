
/**
 * Write a description of class Property here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Property extends Squares
{
    private int cost;
    private int rent;
    //private boolean owned;
    // private SquareState state;

    public Property(String name,int cost,int rent)
    {
        super(name);
        this.cost = cost;
        this.rent = rent;
        //this.state = SquareState.AVAILABLE;    
    }

    public int getCost()
    {
        return cost;
    }

    public int getRent()
    {
        return rent;
    }

    //     public SquareState getState()
    //     {
    //         return state;
    //     }

    //     public void changeState(SquareState state)
    //     {
    //         this.state = state;
    //     }

    //     public String getType()
    //     {
    //         return type;
    //     }
        public void doAction()
    {
        System.out.println("JUST BUY IT!");
    }
    
    public String toString()
    {
        return super.toString()
        + "\nCost :" + cost
        + "\nRent :" + rent
            //+ "\nState :" + state
        + "\n";
    }
}
