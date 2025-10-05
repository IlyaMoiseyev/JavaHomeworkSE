package lesson15.task2;

/* Задача №2:
   На вход поступает массив непустых строк, создайте и верните Map<String
   String> следующим образом: для каждой строки добавьте ее первый символ в
   качестве ключа с последним символом в качестве значения. Пример:

   pairs(["code", "bug"]) -> ("Ь": "g", "с": "е")
   pairs(["man", "moon", "main"]) - <"m": "n">
   pairs(["man", "moon", "good", "night"]) -> {"g": "d", "m": "n", "n": "t"} */

public class Main {
  public static void main(String[] args) {
    FirstAndLastCharacters.startFirstAndLastCharactersProgram();
  }
}
