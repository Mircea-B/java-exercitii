package McBooks;

public class Notebook extends Product {
    String name;

    public Notebook(String name, int id, double price, boolean isOnOffer, int offerDiscount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.isOnOffer = isOnOffer;
        this.offerDiscount = offerDiscount;
    }

    public String getName() {
        return name;
    }



}

