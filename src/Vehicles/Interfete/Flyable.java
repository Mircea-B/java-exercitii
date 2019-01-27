package Vehicles.Interfete;

public interface Flyable {
    public default void fly() {
        System.out.println("zboara puiule, zboara");
    }
}
