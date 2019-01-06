package poveste2;

public class Poveste {
    public static void main(String[] args) {


        Personaj furnica = new Personaj("john", new Camara(2), 0, 3);
        Personaj greiere = new Personaj("elvis", new Camara(3), 3, 0);

// in obiectele greiere si furnica exista cate o camara...
        System.out.println(greiere.getCamara().graunta);
        System.out.println(furnica.getCamara().graunta);

        new Timp().vara(furnica);
        new Timp().vara(furnica);
        new Timp().iarna(furnica);
        System.out.println(greiere.getCamara().graunta);
        System.out.println(furnica.getCamara().graunta);
        new Timp().vara(greiere);
        new Timp().vara(greiere);
        new Timp().iarna(greiere);
        System.out.println(greiere.getCamara().graunta);
        System.out.println(furnica.getCamara().graunta);


        System.out.println(greiere.getCamara().nrDeGraunte);
        System.out.println(greiere.getCamara().nrDeGraunte);
        System.out.println(furnica.getCamara().nrDeGraunte);
        System.out.println(furnica.getCamara().nrDeGraunte);
    }

}
