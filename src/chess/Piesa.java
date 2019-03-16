package chess;

public class Piesa {

    private PiesaInfo piesaInfo;
    private Culoare culoare;
    private int x;
    private int y;

    public Piesa(PiesaInfo piesaInfo, Culoare culoare, int x, int y) {
        this.piesaInfo = piesaInfo;
        this.culoare = culoare;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Piesa{" +
                "piesaInfo=" + piesaInfo +
                ", culoare=" + culoare +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getPiesaDescription(){
        return piesaInfo.getPiesaDescription();
    }
}
