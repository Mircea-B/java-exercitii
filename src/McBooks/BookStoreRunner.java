package McBooks;

import java.util.Scanner;

public class BookStoreRunner {
    public static void main(String[] args) {

        Scanner buffer=new Scanner(System.in);
        Book shogun = new Book("The art of war", 259863, 45.99, true, 15);
        Book orfana = new Book("Orfana", 3121354, 25.99, true, 15);
        Pen schneider=new Pen("Pixulescu",9238,42.15,false,15);
        Pen schneider2=new Pen("Pixul",9238,42.15,false,10);
        Texts texte = new Texts();
        Bookstore librarie = new Bookstore();
        Navigation navigare=new Navigation(librarie);
//        librarie.addBook(shogun);
//        librarie.addPen(schneider);
//        librarie.printBooks();
//        librarie.printPen();
//        librarie.readBook(buffer);
//        librarie.printBooks();
       navigare.mainMenu();

        //texte.getMainMenu();


    }

}
