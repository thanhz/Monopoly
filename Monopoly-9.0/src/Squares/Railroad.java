import java.util.*;
/**
 * Similar to property class
 * 
 * @author (Tri Lam)
 * @version (7.0)
 */
public class Railroad extends Squares
{
    private int cost;
    private int rent;
    private boolean owned;
    private Player owner;

    public Railroad(String name,int cost,int rent)
    {
        super(name);
        this.cost=cost;
        this.rent=rent;
        owned = false;
    }

    public int getCost()
    {
        return cost;
    }

    public int getRent()
    {
        return rent;
    }

    public String getOwner()
    {
        return owner.getName();
    }

    public boolean isOwned()
    {
        return owned;
    }

    public void doAction(Player player)
    {
        System.out.println(player.getName()+ " landed on " +getName());
        if(isOwned())//if property is owned
        {
            System.out.println(player.getName() + " Pays "+ owner.getName() +rent +"\n");
            player.decrementMoney(rent); 
            owner.addMoney(rent);
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
    }

    public String toString()
    {
        String owner2 = "No Owner";
        if(owned == true)
        {
            owner2 = owner.getName();
        }
        return super.toString()
        + "\nCost :" + cost
        + "\nRent :" + rent
        + "\nOwner :" + owner2
            //+ "\nState :" + state
        + "\n";
    }
}
