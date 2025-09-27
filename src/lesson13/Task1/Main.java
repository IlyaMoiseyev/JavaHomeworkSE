package lesson13.Task1;
import java.io.File;

/* Задача №1. В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
   Проанализировать и записать в другой файл самое длинное слово. */

public class Main {

  public static void main(String[] args) {
    SearchTheLongestString.writeTheLongestStringInFile(SearchTheLongestString
            .startSearchTheLongestString(getTextFile()));
  }

  public static File getTextFile() {
    return new File("src\\lesson13\\Task1", "romeo-and-juliet.txt");
  }
}
