package Vehicles.Clasedeobiecte;

import Vehicles.Interfete.Flyable;
import Vehicles.Interfete.Plane;

public class JetfighterPlane implements Plane, Flyable {
    @Override
    public void transport() {
        System.out.println("Transport Jetfighter");
    }



    @Override
    public void moveWing() {

    }
}
