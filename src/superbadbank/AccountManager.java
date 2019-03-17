package superbadbank;

public class AccountManager {
    Client client;
    int suma1 = client.getAccount().getMoney();


    public int addMoney(Client client, int suma) {
        int cont = client.getAccount().getMoney();
        cont = cont + suma;
        return cont;
    }

    public int removeMoney(Client client, int suma) {
        int suma2=0;
        if (sold(client) > 0 && sold(client) > suma) {
             suma2 = suma1 - suma;

        }
        return suma2;
    }

    public int sold(Client client) {
        return suma1;
    }

}
