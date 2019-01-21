package JavaAdvanced;

public class Dog {

    private String name;
    private Boolean canDoTricks;

    public Dog(String name, boolean canDoTricks){
        this.name=name;
        this.canDoTricks=canDoTricks;
    }

    public String getName() {
        return name;
    }

    public Boolean getCanDoTricks() {
        return canDoTricks;
    }
}
