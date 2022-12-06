package day17;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] figuresArray = new ChessPiece[8][8];

        for (ChessPiece[] line: figuresArray) {
            Arrays.fill(line, ChessPiece.EMPTY);
        }
        
        figuresArray[0][0] = ChessPiece.ROCK_BLACK;
        figuresArray[0][5] = ChessPiece.ROCK_BLACK;
        figuresArray[0][6] = ChessPiece.KING_BLACK;
        
        figuresArray[1][1] = ChessPiece.ROCK_WHITE;
        figuresArray[1][4] = ChessPiece.PAWN_BLACK;
        figuresArray[1][5] = ChessPiece.PAWN_BLACK;
        figuresArray[1][7] = ChessPiece.PAWN_BLACK;
        
        figuresArray[2][0] = ChessPiece.PAWN_BLACK;
        figuresArray[2][2] = ChessPiece.KNIGHT_BLACK;
        figuresArray[2][6] = ChessPiece.PAWN_BLACK;
        
        figuresArray[3][0] = ChessPiece.QUEEN_BLACK;
        figuresArray[3][3] = ChessPiece.BISHOP_WHITE;
        
        figuresArray[4][3] = ChessPiece.BISHOP_BLACK;
        figuresArray[4][4] = ChessPiece.PAWN_WHITE;
        
        figuresArray[5][4] = ChessPiece.BISHOP_WHITE;
        figuresArray[5][5] = ChessPiece.PAWN_WHITE;

        figuresArray[6][0] = ChessPiece.PAWN_WHITE;
        figuresArray[6][3] = ChessPiece.QUEEN_WHITE;
        figuresArray[6][5] = ChessPiece.PAWN_WHITE;
        figuresArray[6][7] = ChessPiece.PAWN_WHITE;

        figuresArray[7][5] = ChessPiece.ROCK_WHITE;
        figuresArray[7][6] = ChessPiece.KING_WHITE;
        
        ChessBoard kRKas2000 = new ChessBoard(figuresArray);
        kRKas2000.print();

    }
}
