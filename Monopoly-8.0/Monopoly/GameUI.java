import java.util.*;
/**
 * Game user interface
 * 
 * @author (Tri Lam) 
 * @version (7.0)
 */
public class GameUI
{
    private static Game game;
    private static Scanner reader = new Scanner(System.in);
    /**
     * Constructor for objects of class GameUI
     */
    public static void main(String[] args)
    {
        int choice = getOption();
        while (choice != 0)
        {            
            // process choice
            if      (choice == 1){getOption2(); break;}
            else if (choice == 2){loadGame();}
            // output menu & get choice
            choice = getOption();
        }
        System.out.println("\nThank-you");
    }

    private static int getOption()
    {
        System.out.println("\n***Main Menu***");
        System.out.println("What would you like to do ?");
        System.out.println("0. Quit");
        System.out.println("1. New Game");
        System.out.println("2. Load a game");

        System.out.println("Enter your choice");
        // read choice
        int option = reader.nextInt();
        reader.nextLine();
        return option;
    }

    private static void getOption2()
    {
        System.out.println("Enter the number of Players");
        int number = reader.nextInt();

        game = new Monopoly(number);
        System.out.println("New Game Created..");

        int choice = getOptions2();
        while (choice != 0)
        {            
            // process choice
            if      (choice == 1){movePlayer();}
            //else if (choice == 2){getFleet();}
            //else if (choice == 3){getShip();}
            //else if (choice == 4){commissionShip();}
            //else if (choice == 5){fightEncounter();}            
            //else if (choice == 6){recommissionShip();}
            //else if (choice == 7){decommissionShip();}
            else if (choice == 8){getState();}
            else if (choice == 9){saveGame();}
            else if (choice == 10){getOption();break;}
            // output menu & get choice
            choice = getOptions2();
        }
    }

    private static int getOptions2()
    {
        System.out.println(game.getCurrentPlayerName() + " turn ");
        System.out.println("0. Quit Game");
        System.out.println("1. Roll Dice");
        //System.out.println("2. Check Properties");
        //System.out.println("3. Check Morgaged");
        //System.out.println("4. Check jail card");
        //System.out.println("5. Unmorgage");
        //System.out.println("6. Upgrade properties");
        //System.out.println("7. Trade???");
        System.out.println("8. View the game’s state");
        System.out.println("9. Save this game");
        System.out.println("10. Back to main menu");

        System.out.println("Enter your choice");
        // read choice
        int option = reader.nextInt();
        reader.nextLine();
        return option;
    }

    private static void movePlayer()
    {
        if(!game.gameover())
        {
            game.movePlayer();
        }
        else
        {
            System.out.println("Winner is: " + game.getWinner());
        }
    }

    private static void getState()
    {
        System.out.println(game.getCurrentPlayer()+ game.getPlayerLocation());
    }

    private static void saveGame()
    {
        System.out.println("Enter a save file name:");
        String name = reader.nextLine();
        game.saveGame(name);
    }

    private static void loadGame()
    {
        try
        {
            System.out.println("Enter a load file name");
            String name = reader.nextLine();
            game.loadGame(name);
        }
        catch (Exception e)   
        {
            System.out.println(e);  
        }
    }
}
