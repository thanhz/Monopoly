
/**
 * The main fundamentals of the game is done here such as moving around the board.
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public class Monopoly
{
    private Board board = new Board();
    private Player[] players;

    private int totalPlayer=0;
    private int currentTurn = 0;
    //int totalPlayer = 0; //Have a variable in constructor to select number of players
    //public static void main(String[] args)
    public Monopoly(int totalPlayers)
    {       
        if(totalPlayers>4)
        {
            System.out.println("Game can only be played with 4 players");
        }
        else{
            players = new Player[totalPlayers];
            this.totalPlayer = totalPlayers;
            for(int i = 0;i < players.length;i++)
            {
                players[i] = new Player("Player " + (i + 1));
            }
        }
    }

    public void movePlayer()
    {

        Player p = players[currentTurn];
        players[currentTurn].move();

        int position = p.getLocation();
        System.out.println(p.getName() + " goes to.. " + board.getSquare(position));
        board.doAction(position,p);

        nextTurn();
    }

    public void nextTurn() {
        if(++currentTurn >= players.length){
            currentTurn = 0;
        }
    }

    public Player getCurrentPlayer()
    {
        return players[currentTurn];
    }
}
