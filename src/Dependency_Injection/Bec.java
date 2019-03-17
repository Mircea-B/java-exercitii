package Dependency_Injection;

public class Bec {


    Energy energie;

    public Bec(Energy energie) {
        this.energie = energie;
    }


    public void turnOn() {
        if (energie.provideEnergy() < 3) {
            System.out.println("Cannot turn on");
        } else {
            System.out.println("Let there be light");
        }


    }
}
