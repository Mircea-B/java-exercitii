package Bloc;

public class Runner {
    public static void main(String[] args) {

Apartament ap1=new Duplex(100);
Apartament ap2=new Garsoniera(54);
        Camera living = new Living();
        Camera baie = new Baie();
        ap1.setCamera(living);
        System.out.println(ap2.toString());

        System.out.println(ap1.toString());

    }
}
