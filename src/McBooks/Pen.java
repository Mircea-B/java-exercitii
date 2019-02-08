package McBooks;

public class Pen extends Product{

    String name;

    public Pen(String name, int id, double price, boolean isOnOffer, int offerDiscount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.isOnOffer = isOnOffer;
        this.offerDiscount = offerDiscount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
