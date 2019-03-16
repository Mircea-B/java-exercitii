package ChessMaster01;

public enum Color {


    White("alb"),
    Black("negru");

    String culoare;
    Color(String culoare) {
        this.culoare=culoare;
    }

    public String getculoare(){
        return culoare;
    }
}
