package day17;

import java.util.List;

public class ChessBoard {
  private ChessPiece[][] figuresOnBoard = new ChessPiece[8][8];

  public ChessBoard(ChessPiece[][] figuresOnBoard) {
    this.figuresOnBoard = figuresOnBoard;
  }

  public void print() {
    for (ChessPiece[] line : figuresOnBoard) {
      for (int i = 0; i < line.length; i++) {
        System.out.print(line[i].getIcon());
      }
      System.out.println();
    }
  }
}
