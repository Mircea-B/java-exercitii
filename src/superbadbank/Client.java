package superbadbank;

public class Client {

    private String name;
    private Account cont;

    public Client(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setAccount(Account account){
        this.cont = account;
    }

    public Account getAccount(){
        return cont;
    }
}