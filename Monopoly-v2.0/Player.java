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
    private int money;
    private int location;
    private ArrayList<Property>properties = new ArrayList<Property>(); 
    private Dice dice = new Dice();

    public Player(String name)
    {
        this.name = name;
        money = 1500;
        location = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getMoney()
    {
        return money;
    }

    public int getLocation()
    {
        return location;
    }

    public void buyProperty(Property property)
    {       
        try{
            if(getMoney()>= property.getCost()&& property.getState() == SquareState.AVAILABLE && property.getType().equals("property"))
            {
                properties.add(property);
                money = money - property.getCost();
                property.changeState(SquareState.OWNED);
                System.out.println(getMoney());
                System.out.println(getName() + " Just Purchased:" + property.getName() + " for " + property.getCost());;
            }
        }catch (IndexOutOfBoundsException e){
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }
    
    public void buyUtility()
    {
        //
    }

    public int roll()
    {
        System.out.println("PreviousLocation: " + location);
        return location = location + dice.roll();
        //.out.println("NewLocation: " + location);       
    }
}
