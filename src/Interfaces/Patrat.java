package Interfaces;

public class Patrat implements Shape {
   private int marimelatura;
    public Patrat(int marimeLatura){
        this.marimelatura=marimeLatura;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getParameters() {
        return 0;
    }
}
