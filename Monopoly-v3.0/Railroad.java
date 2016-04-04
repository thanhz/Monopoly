
/**
 * Write a description of class Railroad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Railroad extends Squares
{
    private int cost;
    private int rent;
    
    public Railroad(String name,int cost,int rent)
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
    
        public void doAction()
    {
        System.out.println("I AM AT A RAILROAD");
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
