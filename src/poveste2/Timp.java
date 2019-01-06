package poveste2;

public class Timp {


    public int vara(Personaj personaj) {
        int vaAduna = personaj.getHarnicie() - personaj.getLene();
        if (vaAduna > 0) {
            personaj.getCamara().graunta = vaAduna;
            personaj.getCamara().nrDeGraunte = personaj.getCamara().nrDeGraunte + personaj.getCamara().graunta;
        } else {
            personaj.getCamara().graunta = 0;
            personaj.getCamara().nrDeGraunte = personaj.getCamara().nrDeGraunte + personaj.getCamara().graunta;
        }
        return personaj.getCamara().nrDeGraunte;
    }

    public int iarna(Personaj personaj) {
        personaj.getCamara().nrDeGraunte = personaj.getCamara().nrDeGraunte - 6;
        if (personaj.getCamara().nrDeGraunte < 1) {
            System.out.println(personaj.nume + " a murit ");
        } else {
            System.out.println("felicitari " + personaj.nume + "a supravituit");
        }
        return personaj.getCamara().nrDeGraunte;
    }

}
