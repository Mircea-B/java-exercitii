package McBooks;

public class Product  implements Discountable{
    int id;
    double price;
    boolean isOnOffer;
    double offerDiscount;


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

    @Override
    public double calculateDiscountPrice() {
        if (isOnOffer == true) {
            price = price - (price * (offerDiscount / 100));
        }
        return price;
    }
}
