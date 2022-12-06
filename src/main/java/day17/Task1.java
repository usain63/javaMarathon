package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> figures = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            figures.add(ChessPiece.PAWN_WHITE);
        }
        for (int i = 0; i < 4; i++) {
            figures.add((ChessPiece.ROCK_BLACK));
        }

        for (ChessPiece figure:figures) {
            System.out.print(figure.getIcon());
        }
    }
}
