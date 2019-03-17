package superbadbank;

public class Account {

    private int money = 0;

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }
}