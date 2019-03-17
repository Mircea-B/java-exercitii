package Design_Paterns_Strategy;

public class Card implements IPay_Source{
    @Override
    public void pay(int amount) {
        System.out.println("card "+amount);
    }
}
