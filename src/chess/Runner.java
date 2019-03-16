package chess;

public class Runner {

    public static void main(String[] args) {

        Board b = new Board();

        b.populateInitialBoard();

        b.printBoard();
    }
}
