import java.util.*;
import java.io.*;
/**
 * The main fundamentals of the game is done here such as moving around the board.
 * 
 * @author (Tri Lam)
 * @version (7.0)
 */
public class Monopoly implements Game, Serializable 
{
    private Board board = new Board();
    private Player[] players;

    private boolean winner = false;
    private int totalPlayer=0;
    private int currentTurn = 0;
    //int totalPlayer = 0; //Have a variable in constructor to select number of players
    //public static void main(String[] args)
    public Monopoly(int totalPlayers)
    {       
        if(totalPlayers<5 && totalPlayers> 0)
        {
            players = new Player[totalPlayers];
            this.totalPlayer = totalPlayers;
            for(int i = 0;i < players.length;i++)
            {
                players[i] = new Player("Player " + (i + 1));
            }
        }
        else{      
            System.out.println("Game can only be played with 4 players");
        }
    }

    public void movePlayer()
    {
        if(gameover()==false)
        {
            Player p = players[currentTurn];
            if(p.isBankrupt())
            { 
                System.out.println(p.getName() + " is Bankrupt ");
                nextTurn();
            }

            p.move();

            int position = p.getLocation();
            System.out.println(p.getName() + " goes to.. " + board.getSquare(position));
            board.doAction(position,p);

            nextTurn();
        }
        else
        {
            getWinner();
        }
    }

    public void movePlayerGUI()
    {
        if(gameover()==false)
        {
            Player p = players[currentTurn];
            if(p.isBankrupt())
            { 
                //System.out.println(p.getName() + " is Bankrupt ");
                nextTurn();
            }

            p.moveGUI();
            int position = p.getLocation();
            board.doAction(position,p);
        }
        else
        {
            getWinner();
        }
    }

    public int getRoll()
    {
        Player p = players[currentTurn];
        return p.getRoll();
    }

    public String getLocationGUI()
    {
        Player p = players[currentTurn];
        int position = p.getLocation();
        return p.getName() + " goes to.. " + board.getSquare(position);
    }

    public void nextTurn() {
        if(++currentTurn >= players.length)
        {
            currentTurn = 0;
        }
    }

    public void addHouse()
    {

    }

    public String getCurrentPlayer()
    {
        return players[currentTurn].toString();
    }

    public int getMoney()
    {
        return players[currentTurn].getMoney();
    }

    public String getCurrentPlayerName()
    {
        return players[currentTurn].getName();
    }

    public String getPlayerLocation()
    {
        Player p = players[currentTurn];
        return "Location: " + board.getSquareName(p.getLocation())+"\n";
    }

    public boolean hasWinner() 
    {
        int ingame = 0;
        for(Player player:players){
            if(!player.isBankrupt())
            {
                ingame++;
            }
        }
        return ingame <= 1;
    }

    public String getWinner() {
        String s = "";
        if(!hasWinner())
        { 
            return "There is no winner yet"; 
        }
        for(Player player:players)
        {
            if(!player.isBankrupt())
            { 
                s = player.toString(); 
            }
        }
        return s;
    }

    public boolean gameover() {
        if(hasWinner())
        {
            return true;
        }
        return false;
    }

    public void saveGame(String fname)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream(fname);
            //OutputStream buffer = new BufferedOutputStream(fileOut);
            ObjectOutputStream oos = new ObjectOutputStream (fileOut);
            oos.writeObject (this);
        }  
        catch (IOException e) {System.out.println (e);}
    }

    public Monopoly loadGame(String fname)
    {
        try
        {
            FileInputStream file = new FileInputStream(fname);
            ObjectInputStream ois  = new ObjectInputStream (file);
            Monopoly mon = (Monopoly)ois.readObject(); 
            winner = mon.winner; 
            totalPlayer = mon.totalPlayer;
            currentTurn = mon.currentTurn;

            players = mon.players;
            board = mon.board;  

            return mon; 
        } 
        catch (Exception e)
        {
            System.out.println(e); 
            return null; 
        }
    }
}