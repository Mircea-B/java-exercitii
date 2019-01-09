package poveste;

public class Poveste {

    public static void main(String[] args) {

        Personaj greiere = new Personaj("greiere", 1, 0, new Camara());
        Personaj furnica = new Personaj("furnicutza", 0, 1, new Camara());


        Timp timp = new Timp();

        timp.vara(greiere);
        timp.vara(greiere);
        timp.vara(greiere);
        timp.vara(greiere);


        timp.vara(furnica);
        timp.vara(furnica);
        timp.vara(furnica);
        timp.vara(furnica);

        timp.iarna(greiere);
        timp.iarna(furnica);

        System.out.println(furnica.getInViata());
        System.out.println(greiere.getInViata());

    }
}