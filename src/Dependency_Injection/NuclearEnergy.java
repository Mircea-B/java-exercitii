package Dependency_Injection;

public class NuclearEnergy implements Energy {

    @Override
    public int provideEnergy() {
        System.out.println("Providing Nuclear energy");
        return 5;
    }
}
