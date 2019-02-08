package McBooks;

public class Book extends Product{

    String title;

    public Book(String title, int id, double price, boolean isOnOffer, int offerDiscount) {
        this.title = title;
        this.id = id;
        this.price = price;
        this.isOnOffer = isOnOffer;
        this.offerDiscount = offerDiscount;
    }

    public String getTitle() {
        return title;
    }


}
