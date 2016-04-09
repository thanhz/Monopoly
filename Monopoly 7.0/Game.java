import java.io.*;
/**
 * Game Interface
 * 
 * @author (Tri Lam) 
 * @version (7.0)
 */
public interface Game
{
    public void movePlayer();

    public void nextTurn();

    public String getCurrentPlayer();
    
    public String getCurrentPlayerName();

    public String getPlayerLocation();

    public boolean hasWinner();

    public String getWinner();

    public boolean gameover();
    
    public void saveGame(String fname);
    
    public Monopoly loadGame(String fname);
}
