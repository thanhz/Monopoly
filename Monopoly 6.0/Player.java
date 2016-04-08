import java.util.*;
import java.io.*;
/**
 * This is the player class and contains all the methods a player can do in the game
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public class Player
{
    private String name;
    private int money = 1500;
    private int location=0;
    private boolean jail;
    private boolean bankrupt = false;
    private Dice dice = new Dice();

    private ArrayList<Squares>myProperty = new ArrayList<Squares>();
    //private ArrayList<Card> cardsOwned;
    private ArrayList<Squares> morgaged = new ArrayList<Squares>();

    public Player(String name)
    {
        this.name = name;
        jail = false;
        if(money<0)
        {
            bankrupt = true;
        }
    }

    public Player getPlayer()
    {
        return this;
    }

    public void move()
    {
        int newPosition = getLocation() + dice.getRoll();
        if(jail == true)
        {
            System.out.println("Sorry you are in jail");
        }
        else if(bankrupt == true)
        {
            System.out.println("You are Bankrupt");
        }
        else if(newPosition-40 > 0)
        {
            newPosition = newPosition-40;
        }
        else
        {
            newPosition = newPosition;
        }
        setLocation(newPosition);
    }

    public boolean isBankrupt()
    {
        return bankrupt;
    }
    
    public void buy(Squares square)
    {
        myProperty.add(square);
    }

    public void morgage(Squares square)
    {
        //square.getCost();
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

    public void decrementMoney(int money)
    {
        this.money = this.money - money;
    }

    public int getMoney()
    {
        return money;
    }

    public void setJail(boolean value)
    {
        jail = value;
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

    public String toString()
    {
        return 
        "\nName :" + name
        + "\nMoney :" + money
            //+ "\nLocation :" + location//location.tostring
        + "\nJail :" + jail
        + "\nBankrupt :" + bankrupt
        + "\n";
    }
}
