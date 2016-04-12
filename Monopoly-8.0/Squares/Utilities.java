
/**
 * Similar to property class but rent is determined by a dice roll
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public class Utilities extends Squares
{
    private int cost;
    private int rent;
    private boolean owned;
    private Dice dice;

    public Utilities(String name, int cost,int rent)
    {
        super(name);
        this.cost=cost;
        this.rent=rent;
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

    public void doAction(Player player)
    {
        System.out.println("I AM AT A UTILITY");
        if(isOwned())//if property is owned
        {            
            System.out.println(player.getName() + "Rolls: " + dice.getRoll());
            rent = dice.getRoll()*4;
            System.out.println(player.getName() + " Pays "+ "xxx" +rent);
            player.addMoney(-rent);  
            //owner needs money
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
            //+ "\nState :" + state
        + "\n";
    }
}
