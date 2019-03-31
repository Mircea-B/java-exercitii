package Design_Paterns_Fizz_Buzz;

public class Runner {

    public static void main(String[] args) {

        Fizz_Buzz_Strategy_Factory strategie = new Fizz_Buzz_Strategy_Factory();

        Fizz_Buzz_Executor executor = new Fizz_Buzz_Executor(strategie.getStrategy(15));

        executor.say(strategie.getStrategy(21));
    }

}
