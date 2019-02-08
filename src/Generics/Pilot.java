package Generics;

import Vehicles.Clasedeobiecte.AirlinerPlane;
import Vehicles.Interfete.Plane;

public class Pilot<T extends AirlinerPlane> {

    private T plane;

    public Pilot(T plane) {
        this.plane = plane;

    }

    public void incepiSaPilotezi() {
        plane.moveWing();
    }
}
