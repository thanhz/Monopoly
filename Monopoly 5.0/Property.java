
/**
 * This is the property class which is the most common square to be landed on in the game.
 * Properties can be bought by players and serve as a source of income.
 * 
 * @author (Tri Lam)
 * @version (5.0)
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
    public void doAction(Player player)
    {
        System.out.println("THIS IS A PROPERTY!");
        if(isOwned())//if property is owned
        {
            System.out.println(player.getName() + " Pays "+ "xxx" +rent);
            player.addMoney(-rent);  
        }
        else
        {
            if(player.getMoney()>=cost)
            {
                System.out.println("Buy "+ getName() + " for "+getCost() +"?");
                player.buy(this);
                player.addMoney(-cost);
                owned = true;
            }
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
