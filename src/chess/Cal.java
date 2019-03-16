package chess;

public class Cal extends Piesa implements Movable {

    public Cal(PiesaInfo piesaInfo, Culoare culoare, int x, int y) {
        super(piesaInfo, culoare, x, y);
    }

    @Override
    public boolean canMove() {
        return false;
    }
}
