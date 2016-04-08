import java.util.*;
/**
 * Similar to property class
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public class Railroad extends Squares
{
    private int cost;
    private int rent;
    private boolean owned;

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

    public boolean isOwned()
    {
        return owned;
    }

    public void doAction(Player player)
    {
        System.out.println("I AM AT A RAILROAD");
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
