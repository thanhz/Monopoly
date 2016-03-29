import java.io.*;
/**
 * Write a description of class PropertyState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum SquareState implements Serializable
{
    AVAILABLE(" Available"), OWNED(" Owned"), MORGAGED (" Morgaged");
    private String state;

    private SquareState(String state)
    {
        this.state = state;
    }

    public String toString()
    {
        return state;
    }
}
