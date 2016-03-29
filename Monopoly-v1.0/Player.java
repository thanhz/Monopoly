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

    public void buy(Property property)
    {       
        try{
            if(getMoney()>= property.getCost()&& property.getState() == true)
            {
                properties.add(property);
                money = money - property.getCost();
                property.changeState(false);
                System.out.println(getMoney());
                System.out.println(getName() + " Just Purchased:" + property.getName() + " for " + property.getCost());;
            }
            else
            {
                //doNothing
            }
        }catch (IndexOutOfBoundsException e){
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public int roll()
    {
        System.out.println("PreviousLocation: " + location);
        return location = location + dice.roll();
        //.out.println("NewLocation: " + location);       
    }
}
