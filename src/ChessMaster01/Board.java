package ChessMaster01;

import ChessMaster01.Piese.Pion;
import ChessMaster01.Piese.Tura;
import chess.Piesa;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Piece> piecesList = new ArrayList<>(8);
    List<List<Piece>> positions = new ArrayList<>(32);

    //Aici jos cream tabla ca si capacitate

    public Board() {
        for (int i = 0; i < positions.size(); i++) {
            positions.add(new ArrayList<>(8));
        }
    }

    public void move() {

    }

    public void remove() {
    }

    public void populateInitialBoard() {
        for (int i = 0; i <= 7; i++) {

            piecesList.add(
                    new Pion(
                            PieceInfo.Pion, Color.White, i, 1));
            piecesList.add(
                    new Pion(
                            PieceInfo.Pion, Color.Black, i, 6));
        }
        piecesList.add(
                new Tura(
                        PieceInfo.Tura, Color.White, 0, 0));
        piecesList.add(
                new Tura(PieceInfo.Tura, Color.White, 0, 7));


        for (int i = 0; i < positions.size(); i++) {
            for (int j = 0; j < positions.size(); j++) {
                for(int k=0;k<positions.size();k++){

                }
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < positions.size(); i++) {
            for (int j = 0; j < positions.get(i).size(); j++) {
                Piece tempPiesa = positions.get(i).get(j);
                if (tempPiesa == null && i < 8 && j < 8) {
                    System.out.print(" ");
                } else {
                    if (tempPiesa != null) {
                        System.out.print(positions.get(i).get(j).informatie);

                    }
                }
            }
            System.out.println("");
        }
    }

}
