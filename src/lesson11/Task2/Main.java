package lesson11.Task2;

/* Задача 2*:
   Программа на вход получает произвольный текст. В этом тексте может быть номер
   документа(один или несколько), емейл и номер телефона. Номер документа в
   формате: xxxx-xxxx-xx, где x- это любая цифра; номер телефона в формате:
   +(xx)xxxxxxx. Документ может содержать не всю информацию, т.е. например, может не
   содержать номер телефона, или другое. Необходимо найти эту информацию и вывести
   в консоль в формате:
   email: teachmeskills@gmail.com
   document number: 1423-1512-51
   и т.д */

public class Main {
  private static String defaultText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
          " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam," +
          " quis nostrud exercitation ullamco 1423-1512-51 laboris nisi ut aliquip ex ea commodo consequat." +
          " Duis aute irure dolor in reprehenderit in voluptate teachmeskills@gmail.com velit esse cillum dolore eu fugiat" +
          " nulla pariatur. Excepteur +375(44)7439673 sint occaecat cupidatat non proident, sunt in culpa qui officia " +
          "deserunt mollit anim id est test@ya.ru laborum.";

  public static void main(String[] args) {
    TextAnalysis.startTextAnalysis(defaultText);
  }
}
