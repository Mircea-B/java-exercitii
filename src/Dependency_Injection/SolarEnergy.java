package Dependency_Injection;

public class SolarEnergy  implements Energy{
    @Override
    public int provideEnergy() {
        System.out.println("Providing solar Energy");
        return 1;
    }
}
