
/**
 * Freeparking keeps money which are paid to the bank i.e. through landing on tax. A player who lands
 * on free parking will obtain all the money freeparking holds.
 * 
 * @author (Tri Lam)
 * @version (5.0)
 */
public class FreeParking extends Squares
{
    private int money;

    public FreeParking(String name)
    {
        super(name);
    }

    public void addMoney(int money)
    {
        this.money = this.money + money;
    }

    public int getMoney()
    {
        return money;
    }

    public void doAction(Player player)
    {
        System.out.println("FREE PARKING");
        if(money == 0)
        {
            System.out.println ("Sorry there is no money here yet");
        }
        else
        {
            System.out.println(getName() + " Yay free money! "+ money);
            player.addMoney(money);
        }
    }

    public String toString()
    {
        return super.toString()
        + "\nMoney: " + money
        + "\n";
    }

}
