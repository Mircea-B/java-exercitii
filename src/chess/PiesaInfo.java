package chess;

public enum PiesaInfo {

    CAL("C"),
    PION("P"),
    TURA("T"),
    REGINA("R"),
    REGE("r"),
    NEBUN("N");

    private String piesaDescription;

    PiesaInfo(String piesaDescription) {
        this.piesaDescription = piesaDescription;
    }

    public String getPiesaDescription(){
        return piesaDescription;
    }
}
