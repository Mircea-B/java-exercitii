package enums;

public class EnumRunner {
    public static void main(String[] args) {

        Length km = Length.Kilometer;
        System.out.println(km.getValue());
        Length oreo = Length.valueOf("Meter");
        System.out.println(oreo);
        double rezultat = km.getValue() * 7.875654f;
        System.out.println(rezultat);
    }
}
