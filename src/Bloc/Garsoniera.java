package Bloc;

public class Garsoniera extends Apartament {


    public Garsoniera(int suprafata) {
        super(suprafata,1);
    }
    @Override
    public String toString(){
        return "sunt o garsoniera si am ca supr " + getSuprafata() + "mp " + "si am " + getNrCamere() + "camere";
    }
}
