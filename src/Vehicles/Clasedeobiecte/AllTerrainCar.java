package Vehicles.Clasedeobiecte;

import Vehicles.Interfete.Car;
import Vehicles.Interfete.Drivable;

public class AllTerrainCar  implements Car, Drivable {
    @Override
    public void parallelPark() {
        System.out.println("parcare laterala Masina de teren");
    }

    @Override
    public void transport() {
        System.out.println("Transport masina de teren");
    }
}
