package Design_Paterns_Strategy;

public class Runner {

    public static void main(String[] args) {
        Biblioteca stra=new Biblioteca();
        IPay_Source sursa = new Card();
        stra.cumparaCarte(sursa);
    }
}
