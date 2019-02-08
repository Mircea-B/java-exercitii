package Generics;

import Vehicles.ObiecteConcrete.BmwM3;
import Vehicles.ObiecteConcrete.Boeing747;

public class Runner {
    public static void main(String[] args) {

        Boeing747 avion = new Boeing747();
        BmwM3 masinuta = new BmwM3();


        Pilot<Boeing747> pilotdeAirliner = new Pilot<>(avion);
        Sofer<BmwM3> soferdeSportscar = new Sofer<>(masinuta);

        pilotdeAirliner.incepiSaPilotezi();
        soferdeSportscar.incepiSaSofezi();
    }
}
