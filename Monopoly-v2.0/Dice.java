
/**
 * Write a description of class Dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dice
{
    public int die1;   // Number showing on the first die.
    public int die2;   // Number showing on the second die.

    public Dice() {
        // Constructor.  Rolls the dice, so that they initially
        // show some random values.
        //roll();  // Call the roll() method to roll the dice.
    }

    public int roll() {
        // Roll the dice by setting each of the dice to be
        // a random number between 1 and 6.
        die1 = (int)(Math.random()*6) + 1;
        //die2 = (int)(Math.random()*6) + 1;
        //int total = die1+die2;
        
        System.out.println("Dice1: " + die1);
        //System.out.println("Dice2: " + die2);
        //System.out.println("Total: " + total);
        return die1;
    }
}
