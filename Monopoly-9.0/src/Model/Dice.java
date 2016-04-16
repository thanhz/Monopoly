import java.io.*;
/**
 * This is the dice class which determines how many spaces a player will go as well as the rent they 
 * have to pay if they land on a utility.
 * The class incorporates the use of 2 dices for a roll.
 * 
 * @author (Tri Lam)
 * @version (7.0)
 */
  public class Dice implements Serializable
{
    public int die1;   // Number showing on the first die.
    public int die2;   // Number showing on the second die.
    public int roll;
    
    public Dice() {
        // Constructor.  Rolls the dice, so that they initially
        // show some random values.
        roll();  // Call the roll() method to roll the dice.
    }

    public void roll() 
    {
        // Roll the dice by setting each of the dice to be
        // a random number between 1 and 6.
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1+die2;

        //System.out.println("Dice1: " + die1);
        //System.out.println("Dice2: " + die2);
        //System.out.println("Total: " + total);
    }
    
    public int getRoll()
    {
        roll();
        return roll;
    }
    
        public int getRoll2()
    {
        return roll;
    }
}
