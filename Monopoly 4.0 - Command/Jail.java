
/**
 * Write a description of class Jail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jail extends Squares
{
    private int turns;
    //put a state injail in player class
    
    public Jail(String name)
    {
        super(name);
    }
    
        public void doAction()
    {
        System.out.println("I AM IN JAIL :(");
    }
    
}
