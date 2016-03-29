
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    // Property[] square = new Property[40];
    private Object[] square = {new Property[28],new LuckCard[6]};
    
    public Board()
    {
        //Property go = new Property("GO");
        //square[0] = go;
        
        //Property old = new Property("Old Kent Road",60,2);
        //Property white = new Property("Whitechapel Road",60,4);
        //Property king = new Property("King's Cross",200,25);
        //Property angel = new Property("The Angel Islington",60,2);
        
        square[0] = new Property("Home",0,0);
        square[1] = new Property("Old Kent Road",60,2);
        square[2] = new Community();
        square[3] = new Property("Whitechapel Road",60,4);
        square[4] = new Property("Income Tax",0,0);
        square[5] = new Property("King's Cross",200,25);
        square[6] = new Property("The Angel Islington",60,2);
        square[7] = new Chance();
        square[8] = new Property("Euston road",100,6);
        square[9] = new Property("Pentonville",120,8);
        square[10]= new Property("Jail",0,0);
        square[11]= new Property("Pall Mall",140,10);
        square[12]= new Property("Electric Company",150,1);;
        square[13]= new Property("Whitehall",140,10);
        square[14]= new Property("Northumberland",160,12);
        square[15]= new Property("Marylebone",200,25);
        square[16]= new Property("Bow",140,10);
        square[17]= new Community();
        square[18]= new Property("Marlborough Street",180,14);
        square[19]= new Property("Vine Street",200,16);
        square[20]= new Property("Free Parking",0,0);
        square[21]= new Property("Strand",220,18);
        square[22]= new Chance();
        square[23]= new Property("Fleet Street",220,18);
        square[24]= new Property("Trafalgar Square",240,20);
        square[25]= new Property("Fenchurch St Station",200,25);
        square[26]= new Property("Leicester Square",260,22);
        square[27]= new Property("Coventry Street",260,22);
        square[28]= new Property("Water Works",150,0);
        square[29]= new Property("Picadilly",280,22);
        square[30]= new Property("Go To Jail",0,0);
        square[31]= new Property("Regent Street",300,26);
        square[32]= new Property("Oxford Steet",300,26);
        square[33]= new Community();
        square[34]= new Property("Bond Street",320,28);
        square[35]= new Property("Liverpool Street Station",200,25);
        square[36]= new Chance();
        square[37]= new Property("Park Lane",350,35);
        square[38]= new Property("Super Tax",0,0);
        square[39]= new Property("Mayfair",400,50);
    }
    
    public Object getSquare(int num)
    {
        return square[num];
    }
}
