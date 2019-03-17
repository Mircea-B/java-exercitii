package Design_Paterns_Fizz_Buzz;

public class Fizz_Buzz_Strategy_Factory {



    public Fizz_Buzz_Strategy_Factory() {
    }

    public Fizz_Buzz_Strategy getStrategy(int numar) {

        if (numar % 3 == 0 && numar % 5 == 0) {
            return new FizzBuzz();
        }
        if (numar % 3 == 0) {
            return new Fizz();

        }
        if (numar % 5 == 0) {
            return new Buzz();

        }
        return new Default();
    }
}
