package chess;

import java.util.ArrayList;
import java.util.List;

public class Board {

    List<List<Piesa>> positions = new ArrayList<>(8);
    List<Piesa> piecesList = new ArrayList<>(32);

    public Board() {
        for (int i = 0; i < 8; i++) {
            positions.add(new ArrayList<>(8));
        }
    }

    public void populateInitialBoard() {
        for (int i = 0; i <= 7; i++) {
            piecesList.add(
                    new Pion(
                            PiesaInfo.PION, Culoare.WHITE, 1, i));
            piecesList.add(
                    new Pion(
                            PiesaInfo.PION, Culoare.BLACK, 6, i));
        }
        piecesList.add(
                new Tura(
                        PiesaInfo.TURA, Culoare.WHITE, 0, 0));
        piecesList.add(
                new Tura(
                        PiesaInfo.TURA, Culoare.BLACK, 7, 7));
        piecesList.add(
                new Tura(
                        PiesaInfo.TURA, Culoare.WHITE, 0, 7));
        piecesList.add(
                new Tura(
                        PiesaInfo.TURA, Culoare.BLACK, 7, 0));

        piecesList.add(
                new Cal(
                        PiesaInfo.CAL, Culoare.BLACK, 0, 1));
        piecesList.add(
                new Cal(
                        PiesaInfo.CAL, Culoare.BLACK, 0, 6));
        piecesList.add(
                new Cal(
                        PiesaInfo.CAL, Culoare.BLACK, 7, 1));
        piecesList.add(
                new Cal(
                        PiesaInfo.CAL, Culoare.BLACK, 7, 6));


        for (int i = 0; i < positions.size(); i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < piecesList.size(); k++) {
                    Piesa tempPiesa = piecesList.get(k);
                    if (tempPiesa.getX() == i && tempPiesa.getY() == j) {
                        positions.get(i).add(j, tempPiesa);
                    } else {
                        positions.get(i).add(null);
                    }
                }
            }
        }


    }


    public void printBoard() {
        for (int i = 0; i < positions.size(); i++) {
            for (int j = 0; j < positions.get(i).size(); j++) {
                Piesa tempPiesa = positions.get(i).get(j);
                if (tempPiesa == null && i < 8 && j < 8) {
                    System.out.print(" ");
                } else {
                    if (tempPiesa != null) {
                        System.out.print(positions.get(i).get(j).getPiesaDescription());

                    }
                }
            }
            System.out.println("");
        }
    }
}
