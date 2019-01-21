package enums;

public enum Length {
    Meter(1,"unitate de baza"),
    Kilometer(1000,"misto"),
    zecekm(10000,"sa vedem");

    private double value;
    String descriere;

    Length(double value,String descriere) {
        this.value = value;
        this.descriere=descriere;
    }

    public double getValue() {
        return value;
    }
}
