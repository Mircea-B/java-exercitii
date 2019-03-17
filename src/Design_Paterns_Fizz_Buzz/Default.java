package Design_Paterns_Fizz_Buzz;

public class Default implements Fizz_Buzz_Strategy {
    @Override
    public void say() {
        System.out.println("Default");
    }
}
