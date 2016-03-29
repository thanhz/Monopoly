
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{   
    private Board board = new Board();
    private Player[] players = new Player[4];
    
    Player player1 = new Player("player1");
    Player player2 = new Player("player2");
    Player player3 = new Player("player3");
    Player player4 = new Player("player4");
    
    //public static void main(String[] args)
    public Game()
    {       

    }

    public void move()
    {
        int count = 0;
        while(count==0)
        {
            int oldloc = player1.getLocation(); //Previous Location
            int roll = player1.roll(); count++; //Roll & UpdateLocation       
            Property newloc = board.getSquare(roll+oldloc); //New location
            player1.buy(newloc);
            System.out.println("New Location: " + player1.getLocation());
        }
    }
}
