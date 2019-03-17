package Design_Paterns_Fizz_Buzz;

public class Fizz_Buzz_Executor {

    Fizz_Buzz_Strategy strategy;


    public Fizz_Buzz_Executor(Fizz_Buzz_Strategy strategy) {
        this.strategy = strategy;
    }

    public void say(Fizz_Buzz_Strategy strategy) {
        strategy.say();

    }

}
