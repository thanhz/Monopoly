import java.util.*;
import java.io.*;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private int money = 1500;
    private int location=0;
    private boolean jail;
    private Dice dice = new Dice();

    private ArrayList<Squares>myProperty = new ArrayList<Squares>();
    //private ArrayList<Card> cardsOwned;
    //private ArrayList<PropertyLand> propertiesMortgaged;

    public Player(String name)// Die[] dice, Board board)
    {
        this.name = name;
        jail = false;
        //this.dice = dice;
        //this.board = board;
        //piece = new Piece(board.getStartSquare());
    }
    
    public Player getPlayer()
    {
        return this;
    }

    public void move()
    {
        int newPosition = getLocation() + dice.getRoll();
        if(newPosition-40 > 0)
        {
            newPosition = newPosition-40;
        }
        else
        {
            newPosition = newPosition;
        }
        setLocation(newPosition);
    }

    public void moveSpecific(int steps)
    {
        int newPosition = getLocation() + steps;
        if(newPosition-40 > 0)
        {
            newPosition = newPosition-40;
        }
        else
        {
            newPosition = newPosition;
        }
    }

    public void buy(Squares square)
    {
        myProperty.add(square);
    }

    public void sell(Squares square)
    {
        myProperty.remove(square);
    }
    
    public void goJail()
    {
        jail = true;
    }

    public ArrayList<Squares> getProperties() {
        return myProperty;
    }

    public void addMoney(int money)
    {
        this.money = this.money + money;
    }

    public int getMoney()
    {
        return money;
    }

    public void setLocation(int location)
    {
        this.location = location;
    }

    public int getLocation()
    {
        return location;
    }

    public String getName()
    {
        return name;
    }

}
