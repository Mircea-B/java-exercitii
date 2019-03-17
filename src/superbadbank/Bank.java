package superbadbank;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bank {

    Map<Integer,Client> clients =
            new HashMap<>();

    public int addClient(String clientName) {
        Client newClient = new Client(clientName);

        int clientId = clients.size() + 1;
        clients.put(clientId, newClient);

        return clientId;
    }

    public void printClients(){
        Set<Map.Entry<Integer,Client>> list = clients.entrySet();

        for (Map.Entry<Integer,Client> allClients : list){

            System.out.println(
                    allClients.getKey() + " : "
                            + allClients.getValue().getName()
                            + " : " + allClients.getValue().getAccount());
        }
    }

    public void addAccount(int clientId) {
        Client tempClient = clients.get(clientId);

        Account newAccount = new Account();

        tempClient.setAccount(newAccount);

    }
}