package McBooks;

public class Texts {

    public void getMainMenu() {
        String mainMenu = "MainMenu:\n" +
                "\t1. Adauga Produse\n" +
                "\t2. Vezi produse\n" +
                "\t3. Cumparare\n" +
                "\t4. Iesire";
        System.out.println(mainMenu);
    }

    public void AddProductMenu() {
        String productMenu = "AddProductMenu:\n" +
                "\t1. Adauga Carte \n" +
                "\t2. Adauga Caiet\n" +
                "\t3. Adauga pix \n";
        System.out.println(productMenu);
    }

    public void ListProductMenu() {
        String listaProduse="Arata Cati\n" +
                "\t1. Arata Carti \n" +
                "\t2. Arata Caiete\n" +
                "\t3. Arata pixuri \n";
        System.out.println(listaProduse);
    }

}
