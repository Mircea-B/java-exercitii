package Design_Paterns_Strategy;

public class Cash implements IPay_Source {

    @Override
    public void pay(int amount) {
        System.out.println("cash " + amount);
    }
}
