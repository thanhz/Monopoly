import java.util.*;
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

    //arraylist integer of housees + method to add a house

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
            player.decrementMoney(rent);  
        }
        else
        {
            if(player.getMoney()>=cost)
            {
                System.out.println("Money: " + player.getMoney());
                askBuy(player);
            }
        }
    }

    public void askBuy(Player player)
    {
        System.out.println("Buy "+ getName() + " for "+getCost() +"? 1=Y 0=N");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        int choice = number;
        if(choice == 1)
        {
            player.buy(this);
            player.decrementMoney(cost);
            owned = true;
            System.out.println(player.getName() + " bought " + this.getName() + " for " +this.getCost());
        }
        else
        {
            //do nothing
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
