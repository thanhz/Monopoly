
/**
 * This is the Tax class which will decrement the players money if they land on it.
 * 
 * @author (Tri Lam)
 * @version (7.0)
 */
public class Tax extends Squares
{
    // instance variables - replace the example below with your own
    private int tax;

    public Tax(String name,int tax)
    {
        super(name);
        this.tax = tax;
    }
    
        public void doAction(Player player)
    {
        System.out.println(player.getName()+ " landed on " + getName());
        System.out.println(player.getName() + " Pays " +tax + " Tax"+"\n");
        player.decrementMoney(tax);
    }
    
    public void addMoney(FreeParking freeparking)
    {
        freeparking.addMoney(tax);
    }
    
        public String toString()
    {
        return super.toString()
        + "\nTax :" + tax
        + "\n";
    }
    
}
