
/**
 * Game Interface
 * 
 * @author (Tri Lam) 
 * @version (6.0)
 */
public interface Game
{
    public void movePlayer();

    public void nextTurn();

    public String getCurrentPlayer();

    public String getPlayerLocation();

    public boolean hasWinner();

    public String getWinner();

    public boolean gameover();
}
