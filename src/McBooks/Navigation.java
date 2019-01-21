package McBooks;

import java.util.Scanner;

public class Navigation {

    Bookstore librarie;
    Scanner buffer2;

    public Navigation(Bookstore librarie) {
        this.librarie = librarie;
        this.buffer2 = buffer2;
    }

    public static void mainMenu() {
        System.out.println("Va rugam selectati un meniu de la 1 la 4");
        Texts.getMainMenu();
        Scanner buffy = new Scanner(System.in);
        int selector = buffy.nextInt();
        if (selector == 1) {
            System.out.println("Va rugam alegeti produsul");
            addProduct();
        }
        if (selector == 2) {
            System.out.println("Va rugam alegeti produsul");
            listProduct();
        }
        if (selector == 3) {
            System.out.println("Va rugam alegeti produsul");
        }
        if (selector == 4) {
            System.exit(0);
        }


    }

    public static void addProduct() {
        System.out.println("Va rugam selectati un meniu de la 1 la 4");
        Texts.AddProductMenu();
        Scanner buffy = new Scanner(System.in);
        int choose_product = buffy.nextInt();
        if (choose_product == 1) {
            new Bookstore().readBook(new Scanner(System.in));
            System.out.println("Felicitari cartea a fost adaugata cu succes");
            addProduct();
        }
        if (choose_product == 2) {
            new Bookstore().readNoteBook(new Scanner(System.in));
            System.out.println("Felicitari caietul a fost adaugat cu succes");
            addProduct();
        }
        if (choose_product == 3) {
            new Bookstore().readPen(new Scanner(System.in));
            System.out.println("Felicitari pixul a fost adaugat cu succes");
            addProduct();
        }
        if (choose_product == 4) {
            mainMenu();
        }


    }

    public static void listProduct() {
        System.out.println("Ce doriti sa vedeti din oferta noastra?");
        Texts.ListProductMenu();
        Scanner buffy = new Scanner(System.in);
        int selector = buffy.nextInt();
        if (selector == 1) {
            System.out.println("Lista de carti este urmatoarea: ");

            listProduct();
        }
        if (selector == 2) {

        }
        if (selector == 3) {

        }
        if (selector == 4) {
            mainMenu();
        }
    }

}
