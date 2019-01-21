package McBooks;

public class Texts {

    public static void getMainMenu() {
        String mainMenu = "MainMenu:\n" +
                "\t1. Adauga Produse\n" +
                "\t2. Vezi produse\n" +
                "\t3. Cumparare\n" +
                "\t4. Iesire";
        System.out.println(mainMenu);
    }

    public static void AddProductMenu() {
        String productMenu = "AddProductMenu:\n" +
                "\t1. Adauga Carte \n" +
                "\t2. Adauga Caiet\n" +
                "\t3. Adauga Pix \n" +
                "\t4. Back \n";
        System.out.println(productMenu);
    }

    public static void ListProductMenu() {
        String listaProduse="Arata Cati\n" +
                "\t1. Arata Carti \n" +
                "\t2. Arata Caiete\n" +
                "\t3. Arata Pixuri \n"+
                "\t4. Back \n";
        System.out.println(listaProduse);
    }

}
