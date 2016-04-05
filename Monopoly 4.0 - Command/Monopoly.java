
/**
 * Write a description of class Monopoly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        //         if(player.isBrokeOut())
        //         { 
        //             return squares[player.getCurrentPosition()]; 
        //         }
        Player p = players[currentTurn];
        players[currentTurn].move();
        //Util.print(player, player.getName() + " goes to " + squares[player.getCurrentPosition()].getName());
        int position = p.getLocation();
        System.out.println(p.getName() + " goes to.. " + board.getSquare(position));
        board.doAction(position);
        //         doAction(player, this);
        //         if(player.getMoney().

        //         isBrokeOut()){
        //             Util.print(player, player.getName() + " has been broke out!");
        //             player.setBrokeOut(true);
        //         }else{
        //             if(count){
        //                 player.nextTurn();
        //             }
        //         }
        //         return squares[newPosition];
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
