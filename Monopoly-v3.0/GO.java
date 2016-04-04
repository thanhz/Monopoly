
/**
 * Write a description of class GO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GO extends Squares
{
    
    
    public GO(String name)
    {
        super(name);
    }
    
    public void doAction()
    {
        System.out.println("I AM HOME");
    }
    
    public String toString()
    {
        return super.toString()
        + "\n";
    }
}
