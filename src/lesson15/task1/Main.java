package lesson15.task1;

/* Задача №1:
   На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
   строка является ключом, и ее значение равно true, если эта строка встречается в массиве
   2 или более раз. Пример:

   wordMultiple(["a", "Ь", "а", "с", "Ь"]) -> {"а": true, "Ь": true, "с": false}
   wordMultiple(["c", "Ь", "а"]) -> {"а": false, "Ь": false, "с": false}
   wordMultiple(["c", "c", "c", "c", "с"]) -> {"c": true} */

public class Main {
  public static void main(String[] args) {
    RepeatingString.startRepeatingStringProgram();
  }
}
