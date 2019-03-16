package ChessMaster01.Piese;

import ChessMaster01.Color;
import ChessMaster01.Movable;
import ChessMaster01.Piece;
import ChessMaster01.PieceInfo;

public class Rege extends Piece implements Movable {
    public Rege(PieceInfo informatie, Color culoare, int x, int y) {
        super(informatie, culoare, x, y);
    }

    @Override
    public boolean canMove(int initialPositionX, int initialPositionY, int toX, int toY) {
        return false;
    }
}

