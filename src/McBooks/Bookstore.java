package McBooks;

import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {


    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Pen> pens = new ArrayList<Pen>();
    ArrayList<Notebook> notebooks = new ArrayList<Notebook>();

    public void addBook(Book book) {
        books.add(book);
    }

    public  void printBooks() {
        for (Book i : books) {
            System.out.println("Cartea dumneavoastra este:\n" + "numele cartii:" + i.getTitle() + "\n" + "ID: " + i.getId() + "\n" +
                    "Este la oferta: " + i.isOnOffer() + "\n" + "Valoare discountului: " + i.getOfferDiscount() + "\n" + "Pretul este: " + i.getPrice());

        }
    }

    public void readBook(Scanner scanner) {
        System.out.println("Va rugam introduceti numele cartii");
        String tempName = scanner.nextLine();
        System.out.println("Va rugam introduceti id-ul cartii");
        int tempId = scanner.nextInt();
        System.out.println("Va rugam introduceti pretul cartii");
        double tempPrice = scanner.nextDouble();
        System.out.println("Este cartea la discount (y/n)");
        boolean tempIsonOffer = false;
        String tempDiscountChoice = scanner.next();
        if (tempDiscountChoice.equals("y")) {
            tempIsonOffer = true;
        }

        System.out.println("Care ar fi discountul cartii?");
        int tempDiscount = scanner.nextInt();

        Book tempBook = new Book(tempName, tempId, tempPrice, tempIsonOffer, tempDiscount);
        addBook(tempBook);
        System.out.println(tempBook.calculateDiscountPrice());
    }

    public void addPen(Pen pen) {
        pens.add(pen);
    }

    public void printPen() {
        for (Pen i : pens) {
            System.out.println("Pixul dumneavoastra este:\n" + "Numele Pixului:" + i.getName() + "\n" + "ID: " + i.getId() + "\n" +
                    "Este la oferta: " + i.isOnOffer() + "\n" + "Valoarea discountului: " + i.getOfferDiscount() + "\n" + "Pretul este: " + i.getPrice());
        }
    }

    public void readPen(Scanner scanner) {
        System.out.println("Va rugam introduceti numele pixului");
        String tempName = scanner.nextLine();
        System.out.println("Va rugam introduceti id-ul pixului");
        int tempId = scanner.nextInt();
        System.out.println("Va rugam introduceti pretul pixului");
        double tempPrice = scanner.nextInt();
        System.out.println("Este pixul la dioscount (y/n)");
        boolean tempIsonOffer=false;
        if (scanner.next().equals("y")) {
            tempIsonOffer = true;
        }
        System.out.println("Care ar fi discountul pixului?");
        int tempDiscount = scanner.nextInt();
        Pen tempPen = new Pen(tempName, tempId, tempPrice, tempIsonOffer, tempDiscount);
        addPen(tempPen);
        System.out.println(tempPen.calculateDiscountPrice());
    }

    public void addNoteBook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public void printNotebook() {
        for (Book zb : books) {
            System.out.println("Caietul dumneavoastra este:\n" + "Numele caietului:" + zb.getTitle() + "\n" + "ID: " + zb.getId() + "\n" +
                    "Este la oferta: " + zb.isOnOffer() + "\n" + "Valoarea discountului: " + zb.getOfferDiscount() + "\n" + "Pretul este: " + zb.getPrice());
        }
    }

    public void readNoteBook(Scanner scanner) {
        System.out.println("Va rugam introduceti numele caietului");
        String tempName = scanner.nextLine();
        System.out.println("Va rugam introduceti id-ul caietului");
        int tempId = scanner.nextInt();
        System.out.println("Va rugam introduceti pretul caietului");
        int tempPrice = scanner.nextInt();
        System.out.println("Este caietul la dioscount (y/n)");
        boolean tempIsonOffer=false;
        if (scanner.next().equals("y")) {
            tempIsonOffer = true;
        }
        System.out.println("Care ar fi discountul caietului?");
        int tempDiscount = scanner.nextInt();
        Notebook tempNotebook = new Notebook(tempName, tempId, tempPrice, tempIsonOffer, tempDiscount);
        System.out.println(tempNotebook.calculateDiscountPrice());
    }

}
