package poveste;

public class Personaj {

    private String nume;
    private int lene;
    private int harnicie;
    private Camara camara;
    private boolean inViata;

    public Personaj(String nume, int lene, int harnicie, Camara camara) {
        this.inViata = true;
        this.nume = nume;
        this.camara = camara;
        this.harnicie = harnicie;
        this.lene = lene;
    }

    public Camara getCamara() {
        return camara;
    }

    public int getLene() {
        return lene;
    }

    public int getHarnicie() {
        return harnicie;
    }

    public void setInViata(boolean inViata) {
        this.inViata = inViata;
    }

    public boolean getInViata() {
        return inViata;
    }
}