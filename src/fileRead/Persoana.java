package fileRead;

public class Persoana {
    private String nume;
    private String varsta;
    private String inaltime;
    private String bunsaurau;

    public Persoana(String nume, String varsta, String inaltime, String bunsaurau) {
        this.nume = nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.bunsaurau = bunsaurau;
    }

    public String getNume() {
        return nume;
    }

    public String getVarsta() {
        return varsta;
    }

    public String getInaltime() {
        return inaltime;
    }

    public String getBunsaurau() {
        return bunsaurau;
    }
}
