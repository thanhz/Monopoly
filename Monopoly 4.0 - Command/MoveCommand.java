
/**
 * Write a description of class MoveCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveCommand implements Command
{
    private Player player;
    private int steps;
    public MoveCommand(int steps)
    {
        this.steps = steps;
        execute();
    }
    
    public void execute()
    {
        player.moveSpecific(steps);
    }
}
