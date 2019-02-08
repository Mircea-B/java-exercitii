package Generics;

import Vehicles.Clasedeobiecte.SportsCar;
import Vehicles.Interfete.Car;


public class Sofer<T extends SportsCar> {

    private T car;

    public Sofer(T car) {
        this.car = car;

    }

    public void incepiSaSofezi() {
        car.parallelPark();
    }

}
