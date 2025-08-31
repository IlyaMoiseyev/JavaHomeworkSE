package lesson5;

/* Задача №2:
   Создать программу для раскраски шахматной доски с помощью цикла. Создать
   двумерный массив String 8х8. С помощью циклов задать элементам массива значения
   B(Black) или W(White). */

public class Chessboard {
  public static void main(String[] args) {
    String[][] board = new String[8][8];
    String colourW = "W";
    String colourB = "B";
    boolean flag = true;

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (flag) {
          board[i][j] = colourW;
          flag = false;
        } else {
          board[i][j] = colourB;
          flag = true;
        }
      }
      flag = !flag;
    }

    for (String[] tempArray : board) {
      for (String element : tempArray) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}
