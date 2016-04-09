
/**
 * A bunch of random events that can happen to a player if they land on the square
 * 
 * @author (Tri Lam)
 * @version (7.0)
 */
public class Chance extends Squares
{
    //arraylist of Cards
    public Chance(String name)
    {
        super(name);
    }

    public void doAction(Player player)
    {
        System.out.println(player.getName()+ " landed on " + getName());
        doThis(player);
    }

    private void doThis(Player player)
    {
        int card = (int) (Math.random()*12);
        switch(card)
        {
            case 0 : advanceGo(player); break;
            case 1 : advanceMayfair(player); break;
            case 2 : goJail(player); break;
            case 3 : bankDivident(player); break;
            case 4 : paySchoolFee(player); break;
            case 5 : speedingFine(player); break;
            case 6 : crossword(player); break;
            case 7 : mature(player); break;
            case 8 : goTrafalgar(player);break;
            case 9 : goMarylebone(player);break;
            case 10: goPall(player);break;
            case 11: drunk(player);break;
            case 12: goBack3(player);break;
        }
    }

    private void advanceGo(Player player)
    {
        System.out.println("Advance to GO"+"\n");
        player.setLocation(0);
    }

    private void advanceMayfair(Player player)
    {
        System.out.println("Advance to Mayfair"+"\n");
        player.setLocation(39);
    }

    private void goJail(Player player)
    {
        System.out.println("Go to Jail. Move Directly to Jail. Do not pass Go Do not Collect $200"+"\n");
        player.goJail();
    }

    private void bankDivident(Player player)
    {
        System.out.println("Bank pays you Dividend of $50"+"\n");
        player.addMoney(50);
    }
    
    private void goBack3(Player player)
    {
        System.out.println("Go back 3 spaces"+"\n");
        int newLocation = player.getLocation() -3;
        player.setLocation(newLocation);
    }

    private void paySchoolFee(Player player)
    {
        System.out.println("Pay School Fees of $150"+"\n");
        player.decrementMoney(150);
    }

    private void speedingFine(Player player)
    {
        System.out.println("Speeding Fine $15"+"\n");
        player.decrementMoney(15);
    }

    private void crossword(Player player)
    {
        System.out.println("You have won a Crossword Competition Collect $100"+"\n");
        player.addMoney(100);
    }

    private void mature(Player player)
    {
        System.out.println("Your Building and Loan Matures Collect $150"+"\n");
        player.addMoney(150);
    }

    private void goTrafalgar(Player player)
    {
        System.out.println("Avance to Trafalgar Square If you Pass Go Collect $200"+"\n");
        player.setLocation(24);
    }
    
    private void goMarylebone(Player player)
    {
        System.out.println("Take a Trip to Marylebone Station and if you Pass Go Collect $200"+"\n");
        player.setLocation(18);
    }
    
    private void goPall(Player player)
    {
        System.out.println("Advance to Pall Mall If you Pass Go Collect $200"+"\n");
        player.setLocation(11);
    }
    
    private void drunk(Player player)
    {
        System.out.println("Drunk in Charge fine $20" +"\n");
        player.decrementMoney(20);
    }
    
        //     public void getOutJail()
    //     {
    //     }
    
        //     public void streetRapair() //100 hotels and 25 houses
    //     {
    //     }
    
    public String toString()
    {
        return super.toString()
        +"\n";
    }
}
