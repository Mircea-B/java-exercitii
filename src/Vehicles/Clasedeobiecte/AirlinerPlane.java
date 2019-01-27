package Vehicles.Clasedeobiecte;

import Vehicles.Interfete.Flyable;
import Vehicles.Interfete.Plane;

public class AirlinerPlane implements Plane, Flyable {
    @Override
    public void transport() {
        System.out.println("Transport Airliner");
    }

    @Override
    public void moveWing() {
        System.out.println("misca aripile airliner");
    }
}
