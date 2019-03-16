package ChessMaster01;

public enum PieceInfo {
    Pion("P"),
    Regina("R"),
    Tura("T"),
    Rege("r"),
    Nebun("N"),
    Cal("C");

    String cx;
    PieceInfo(String initiala) {
        this.cx = initiala;
    }

    public String getPieccerepresentation() {
        return cx;
    }
}
