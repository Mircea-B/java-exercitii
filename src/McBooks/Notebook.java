package McBooks;

public class Notebook {
    String name;
    int id;
    double price;
    boolean isOnOffer;
    double offerDiscount;

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

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOnOffer() {
        return isOnOffer;
    }

    public double getOfferDiscount() {
        return offerDiscount;
    }
    public double calculateDiscountPrice() {
        if (isOnOffer == true) {
            price = price - (price * (offerDiscount / 100));
        }return price;
    }

}

