
/**
 * A bunch of random events that can happen to a player if they land on the square
 * 
 * @author (Tri Lam)
 * @version (7.0)
 */
public class Community extends Squares
{
    //arraylist of Cards
    public Community(String name)
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
            case 0 : taxRefund(player); break;
            case 1 : sale(player); break;
            case 2 : goJail(player); break;
            case 3 : interest(player); break;
            case 4 : advanceGo(player); break;
            case 5 : hospital(player); break;
            case 6 : beauty(player); break;
            case 7 : bank(player); break;
            case 8 : inherit(player);break;
            case 9 : goJail(player);break;
            case 10: insurance(player);break;
            case 11: doctor(player);break;
            case 12: goKent(player);break;
            case 13: annuity(player);break;
        }
    }

    private void taxRefund(Player player)
    {
        System.out.println("Income Tax refund Collect $20"+"\n");
        player.addMoney(20);
    }

    private void sale(Player player)
    {
        System.out.println("From Sale of Stock you get $50"+"\n");
        player.addMoney(50);
    }

    private void interest(Player player)
    {
        System.out.println("Receive Interest on 7% Preference Shares $25"+"\n");
        player.addMoney(25);
    }

    private void advanceGo(Player player)
    {
        System.out.println("Advance to GO"+"\n");
        player.setLocation(0);
    }

    private void hospital(Player player)
    {
        System.out.println("Pay Hospital $100"+"\n");
        player.decrementMoney(100);
    }
    
       private void beauty(Player player)
    {
        System.out.println("You have Won Second Prize in a Beauty Contest Collect $10"+"\n");
        player.addMoney(10);
    }

    private void bank(Player player)
    {
        System.out.println("Bank error in your favour collect $200"+"\n");
        player.addMoney(200);
    }

    private void inherit(Player player)
    {
        System.out.println("You inherit $100"+"\n");
        player.addMoney(100);
    }

    private void goJail(Player player)
    {
        System.out.println("Go to Jail. Move Directly to Jail. Do not pass Go Do not Collect $200"+"\n");
        player.goJail();
    }
    
        private void insurance(Player player)
    {
        System.out.println("Pay your Insurance Premium $50"+"\n");
        player.decrementMoney(50);
    }
    
            private void doctor(Player player)
    {
        System.out.println("Doctor's Fee Pay $50"+"\n");
        player.decrementMoney(50);
    }
    
        private void goKent(Player player)
    {
        System.out.println("Go Back to Old Kent Road "+"\n");
        player.setLocation(1);
    }
    
        private void annuity(Player player)
    {
        System.out.println("Annuity Matures Collect $100"+"\n");
        player.addMoney(100);
    }

    //     private void birthday(Player player)
    //     {
    //         System.out.println("It is YourBirthday Collect $10 from each Player");
    //         player.addMoney(10);
    //     }

    public String toString()
    {
        return super.toString()
        +"\n";
    }
}
