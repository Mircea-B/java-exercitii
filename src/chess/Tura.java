package chess;

public class Tura extends Piesa implements Movable {


    public Tura(PiesaInfo piesaInfo, Culoare culoare, int x, int y) {
        super(piesaInfo, culoare, x, y);
    }

    @Override
    public boolean canMove() {
        return false;
    }
}
