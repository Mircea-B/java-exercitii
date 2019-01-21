package Bloc;

public class Duplex extends Apartament {


    public Duplex(int suprafata) {
        super(suprafata,2);
    }

    @Override
    public String toString(){

        return "sunt un duplex si am ca supr " + getSuprafata() + "mp " + "si am " + getNrCamere() + "camere" + " si am o camera de tip :" + getCamera().toString();
    }
}
