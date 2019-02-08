package Vehicles.Clasedeobiecte;

import Vehicles.Interfete.Car;
import Vehicles.Interfete.Drivable;

public class SportsCar implements Car, Drivable {


    @Override
    public void parallelPark() {
        System.out.println("Parcare laterala masina sport");
    }

    @Override
    public void transport() {
        System.out.println("Parcare laterala masina sport");
    }

    @Override
    public void drive() {
        System.out.println("conduce o masina Sport");
    }
}
