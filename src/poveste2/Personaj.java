package poveste2;

import java.security.PublicKey;

public class Personaj {

    public String nume;
    private Camara camara;
    private int lene;
    private int harnicie;
    private boolean inViata;

    public Personaj(String nume,Camara camara, int lene, int harnicie) {
        this.nume = nume;
        this.camara = camara;
        this.lene = lene;
        this.harnicie = harnicie;
        this.inViata =true;
    }
public Camara getCamara() {
        return camara;
}
public int getHarnicie(){
        return harnicie;
}

    public int getLene() {
        return lene;
    }

}
