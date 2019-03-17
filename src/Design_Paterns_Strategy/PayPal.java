package Design_Paterns_Strategy;

public class PayPal implements IPay_Source {
    @Override
    public void pay(int amount) {
        System.out.println("paypal " + amount);
    }
}
