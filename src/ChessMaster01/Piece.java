package ChessMaster01;

public class Piece {
    PieceInfo informatie;
    Color culoare;
    int x;
    int y;

    public Piece(PieceInfo informatie, Color culoare, int x, int y) {
        this.informatie = informatie;
        this.culoare = culoare;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
}
