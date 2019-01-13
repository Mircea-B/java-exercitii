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

    public void printBooks() {
        for (Book i : books) {
            System.out.println("Cartea dumneavoastra este:\n"+"numele cartii:"+i.getTitle() + "\n" +"ID: "+ i.getId() + "\n"+
                    "Este la oferta: "+i.isOnOffer()+"\n" +"Valoare discountului: "+i.getOfferDiscount() + "\n" +"Pretul este: "+ i.getPrice());
            System.out.println(i.calculateDiscountPrice());
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
        boolean tempIsonOffer=true;
        if(scanner.next()=="y"){
            tempIsonOffer=true;
        }else{
            tempIsonOffer=false;
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
        for (Book i : books) {
            System.out.println("Pixul dumneavoastra este:\n"+"Numele Pixului:"+i.getTitle() + "\n" +"ID: "+ i.getId() + "\n"+
                    "Este la oferta: "+i.isOnOffer()+"\n" +"Valoarea discountului: "+i.getOfferDiscount() + "\n" +"Pretul este: "+ i.getPrice());
        }
    }
    public void readPen(Scanner scanner) {
        System.out.println("Va rugam introduceti numele pixului");
        String tempName = scanner.nextLine();
        System.out.println("Va rugam introduceti id-ul pixului");
        int tempId = scanner.nextInt();
        System.out.println("Va rugam introduceti pretul pixului");
        double tempPrice = scanner.nextInt();
        System.out.println("Este caietul la dioscount (y/n)");
        boolean tempIsonOffer;
        if(scanner.next()=="y"){
            tempIsonOffer=true;
        }else{
            tempIsonOffer=false;
        }
        System.out.println("Care ar fi discountul pixului?");
        int tempDiscount = scanner.nextInt();
        Pen tempPen = new Pen(tempName, tempId, tempPrice, tempIsonOffer, tempDiscount);
        addPen(tempPen);
    }

    public void addNoteBook(Notebook notebook) {
        notebooks.add(notebook);
    }
    public void printNotebook() {
        for (Book i : books) {
            System.out.println("Caietul dumneavoastra este:\n"+"Numele caietului:"+i.getTitle() + "\n" +"ID: "+ i.getId() + "\n"+
                    "Este la oferta: "+i.isOnOffer()+"\n" +"Valoarea discountului: "+i.getOfferDiscount() + "\n" +"Pretul este: "+ i.getPrice());
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
        boolean tempIsonOffer;
        if(scanner.next()=="y"){
            tempIsonOffer=true;
        }else{
            tempIsonOffer=false;
        }
        System.out.println("Care ar fi discountul caietului?");
        int tempDiscount = scanner.nextInt();
        Notebook tempNotebook = new Notebook(tempName, tempId, tempPrice, tempIsonOffer, tempDiscount);
        addNoteBook(tempNotebook);
    }

}
