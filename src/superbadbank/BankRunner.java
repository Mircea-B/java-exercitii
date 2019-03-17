package superbadbank;

public class BankRunner {

    public static void main(String[] args) {
        Bank b = new Bank();
        AccountManager contManager=new AccountManager();

        int firstClientId = b.addClient(
                "First Client");
        int secondClientId = b.addClient(
                "Second Client");

        b.addAccount(secondClientId);
        b.addAccount(firstClientId);

        b.printClients();
    }
}