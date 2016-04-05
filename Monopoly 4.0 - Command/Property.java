
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
    private boolean owned;
    //private SquareState state;

    public Property(String name,int cost,int rent)
    {
        super(name);
        this.cost = cost;
        this.rent = rent;
        owned = false;
        //this.state = SquareState.AVAILABLE;    
    }
    
    public Property getProperty()
    {
        return this;
    }

    public int getCost()
    {
        return cost;
    }

    public int getRent()
    {
        return rent;
    }

    public boolean isOwned()
    {
        return owned;
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
        System.out.println("THIS IS A PROPERTY!");
        if(isOwned())//if property is owned
        {
            getRent();  
        }
        else
        {
            System.out.println("Buy For:"+ getCost() +"?");
        }
    }

    public String toString()
    {
        return super.toString()
        + "\nCost :" + cost
        + "\nRent :" + rent
        + "\nOwned :" + owned
            //+ "\nState :" + state
        + "\n";
    }
}
