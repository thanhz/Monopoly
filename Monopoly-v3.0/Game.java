
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game implements Monopoly
{
    private Board board = new Board();
    private Player[] players = new Player[4];//4 Player
    private int currentTurn = 0;
    //int totalPlayer = 0; //Have a variable in constructor to select number of players
    //public static void main(String[] args)
    public Game()
    {       
        players[0] = new Player("player1");
        players[1] = new Player("player2");
        players[2] = new Player("player3");
        players[3] = new Player("player4");
    }

    //         public Game(int totalPlayer)
    //     {       
    //         players = new Player[totalPlayer];
    //         this.totalPlayer = totalPlayer;
    //         for(int i = 0;i < players.length;i++){
    //             players[i] = new Player("Player ",(i + 1));
    //         }
    //     }

    public void move()
    {
        for (Player temp: players)
        {
            int newPosition = temp.getLocation() + temp.roll();
            if(newPosition-40 > 0)
            {
                newPosition = newPosition-40;
            }
            else
            {
                newPosition = newPosition;
            }
            temp.setLocation(newPosition);
            System.out.println ("you are at: " + board.getSquareName(newPosition));
            //board.getSquare(newPosition);
            board.doAction(newPosition);
            System.out.println ("you are at: " + board.getSquareName(newPosition)+ "\n");
            //nextTurn();
        }
        //         int newPosition = Player.getLocation() + player1.roll();
        //         if(newPosition-40 > 0)
        //         {
        //             newPosition = newPosition-40;
        //         }
        //         else
        //         {
        //             newPosition = newPosition;
        //         }
        //         player1.setLocation(newPosition);
        //         //board.getSquare(newPosition);
        //         board.doAction(newPosition);
        //         nextTurn();
    }
    // 
    //     public void nextTurn() {
    //         if(++currentTurn >= players.length){
    //             currentTurn = 0;
    //         }
    //     }
    // 
    //     public Player getCurrentPlayer()
    //     {
    //         return players[currentTurn];
    //     }
}
