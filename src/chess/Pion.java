package chess;

public class Pion extends Piesa implements Movable {


    public Pion(PiesaInfo piesaInfo, Culoare culoare, int y, int x) {
        super(piesaInfo, culoare, y, x);
    }

    @Override
    public boolean canMove() {
        return false;
    }
}
