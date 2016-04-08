import java.util.*;
import java.io.*;
/**
 * Contains creation of all the possible squares which can be landed on in the game 
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public class Board implements Serializable
{
    private Squares[] square = new Squares[40];
    public Board()
    {  
        square[0] = new GO("GO");
        square[1] = new Property("Old Kent Road",60,2);
        square[2] = new Community("Community");
        square[3] = new Property("Whitechapel Road",60,4);
        square[4] = new Tax("Income Tax",200);
        square[5] = new Railroad("King's Cross",200,25);
        square[6] = new Property("The Angel Islington",60,2);
        square[7] = new Chance("Chance");
        square[8] = new Property("Euston road",100,6);
        square[9] = new Property("Pentonville",120,8);
        square[10]= new Jail("Jail");
        square[11]= new Property("Pall Mall",140,10);
        square[12]= new Utilities("Electric Company",150,1);;
        square[13]= new Property("Whitehall",140,10);
        square[14]= new Property("Northumberland",160,12);
        square[15]= new Railroad("Marylebone",200,25);
        square[16]= new Property("Bow",140,10);
        square[17]= new Community("Community");
        square[18]= new Property("Marlborough Street",180,14);
        square[19]= new Property("Vine Street",200,16);
        square[20]= new FreeParking("Free Parking");
        square[21]= new Property("Strand",220,18);
        square[22]= new Chance("Chance");
        square[23]= new Property("Fleet Street",220,18);
        square[24]= new Property("Trafalgar Square",240,20);
        square[25]= new Railroad("Fenchurch St Station",200,25);
        square[26]= new Property("Leicester Square",260,22);
        square[27]= new Property("Coventry Street",260,22);
        square[28]= new Utilities("Water Works",150,0);
        square[29]= new Property("Picadilly",280,22);
        square[30]= new GotoJail("Go To Jail");
        square[31]= new Property("Regent Street",300,26);
        square[32]= new Property("Oxford Steet",300,26);
        square[33]= new Community("Community");
        square[34]= new Property("Bond Street",320,28);
        square[35]= new Railroad("Liverpool Street Station",200,25);
        square[36]= new Chance("Chance");
        square[37]= new Property("Park Lane",350,35);
        square[38]= new Tax("Super Tax",100);
        square[39]= new Property("Mayfair",400,50);
    }

    public Squares getSquare(int num)
    {
        return square[num];
    }

    public String getSquareName(int num)
    {
        Squares x = square[num];
        return x.getName();
    }

    //     public String getSquareName(String name)
    //     {
    //         for(Squares temp: square)
    //         {
    //             if(temp.getName().equals(name))
    //             {
    //                 return temp.getName();
    //             }
    //         }
    //         return "Not Found";
    //     }

    public void doAction(int num, Player player)
    //@param num is the square in which an action will be executed
    {
        for(Squares temp: square)
        {
            if(temp.getSquare() == square[num])
            {
                temp.doAction(player);//temp.doAction(player, this);
            }
        }
    }

    public void getAllSquare()
    {
        int x = 0;//Square Number
        for (int i = 0; i < square.length; i++) 
        {
            x++;
            System.out.println(square[i] + "Square: "+ x);
        }
    }
}
