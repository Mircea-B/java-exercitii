package Design_Paterns_Fizz_Buzz;

public class Buzz implements Fizz_Buzz_Strategy {


    @Override
    public void say() {
        System.out.println("Buzz");
    }
}
