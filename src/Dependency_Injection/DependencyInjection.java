package Dependency_Injection;

public class DependencyInjection {
    public static void main(String[] args) {
        Energy nuclearEnergy = new NuclearEnergy();
        Energy solarenergy = new SolarEnergy();
        Bec becNuclear = new Bec(nuclearEnergy);
        Bec becSolar = new Bec(solarenergy);
        becNuclear.turnOn();
        becSolar.turnOn();
    }
}
