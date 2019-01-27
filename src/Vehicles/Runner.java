package Vehicles;

import Vehicles.ObiecteConcrete.BmwM3;
import Vehicles.ObiecteConcrete.Boeing747;
import Vehicles.ObiecteConcrete.Duster;
import Vehicles.ObiecteConcrete.Mig21;

public class Runner {

    public static void main(String[] args) {

        BmwM3 m5 = new BmwM3();
        Duster ionela = new Duster();
        Boeing747 tatucu=new Boeing747();
        Mig21 flash=new Mig21();
        flash.moveWing();
        tatucu.moveWing();
        ionela.transport();
        m5.parallelPark();

    }
}
