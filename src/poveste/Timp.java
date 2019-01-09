package poveste;

public class Timp {

    public void vara(Personaj personaj) {
        int vaAduna = personaj.getHarnicie() - personaj.getLene();
        if (vaAduna < 0) {
            vaAduna = 0;
        }

        personaj.getCamara().setGraunta(personaj.getCamara().getGraunta() + vaAduna);
    }

    public void iarna(Personaj personaj) {
        if(personaj.getCamara().getGraunta() < 3){
            personaj.setInViata(false);
        }
    }
}