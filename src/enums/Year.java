package enums;

public enum Year {
    January("Winter", "cold as sh...t", 31, -3),
    Febryary("Winter", "cold", 28, 3),
    March("Spring", "bitter warm", 31, 12),
    April("Spring", "warm", 30, 18),
    June("Summer", "hot", 31, 22),
    July("Summer", "oven hot", 30, 30),
    August("Summer", "hot", 31, 28),
    September("Autumn", "warm", 30, 22),
    October("Autumn", "bitter warm", 31, 16),
    November("Autumn", "chill", 30, 10),
    December("Winter", "cold", 31, 4);

    private String anotimp;
    private String feels;
    private int noDays;
    private int mediumTemp;

    Year(String anotimp, String feels, int noDays, int mediumTemp) {
        this.anotimp = anotimp;
        this.feels = feels;
        this.noDays = noDays;
        this.mediumTemp = mediumTemp;
    }

    public String getAnotimp() {
        return anotimp;
    }

    public String getFeels() {
        return feels;
    }

    public int getNoDays() {
        return noDays;
    }

    public int getMediumTemp() {
        return mediumTemp;
    }



}
