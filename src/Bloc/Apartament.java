package Bloc;

public class Apartament {
    private int suprafata;
    private int nrCamere;
    private Camera camera;

    public Apartament(int suprafata, int nrCamere) {
        this.suprafata = suprafata;
        this.nrCamere = nrCamere;
    }

    public Apartament(){

    }
    public String toString(){
        return "sunt un ap si am ca supr " + suprafata + "mp " + "si am " + nrCamere + "camere";
    }

    public int getSuprafata() {
        return suprafata;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public Camera getCamera() {
        return camera;
    }
    public void setCamera(Camera camera){
        this.camera=camera;
    }

}
