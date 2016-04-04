
/**
 * Write a description of class Tax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
        public void doAction()
    {
        System.out.println("PAY UP FOOL!");
    }
    
}
