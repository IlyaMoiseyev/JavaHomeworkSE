package lesson1;

public class ArithmeticOperations {
  public static void main(String[] args) {
    task1(6, 2);
    tasks2And3(45);
    tasks2And3(148);
    task4(46.5);
    task5();
    task6(2, 1);
  }

  /*  Написать приложение, которое будет вычислять и выводить значение
      по формуле: a=4*(b+c-1)/2; b и c задаем в коде самостоятельно. */

  public static void task1(int b, int c) {
    int a = 4 * (b + c - 1) / 2;
    System.out.println(a);
  }

  /* 1) В переменной n хранится двузначное число. Создайте программу,
      вычисляющую и выводящую на экран сумму цифр n. Например: n =26,
      в результате мы должны получить 8 (2+6).
     2) В переменной n хранится трёхзначное число. Создайте программу,
      вычисляющую и выводящую на экран сумму цифр n. Например: n =126,
      в результате мы должны получить 9 (1+2+6).
  */

  public static void tasks2And3(int number) {
    int sumOfNumbers = 0;
    String strNumber = "" + number;
    char[] massNum = strNumber.toCharArray();

    for (char c : massNum) {
      String tempStr = "" + c;
      sumOfNumbers += Integer.parseInt(tempStr);
    }
    System.out.println(sumOfNumbers);
  }

/*  В переменной n хранится вещественное число с ненулевой дробной частью.
    Создайте программу, округляющую число n до ближайшего целого и выводящую
    результат на экран. */

  public static void task4(double number) {
    int numToPrint = (int) number;
    if (number % 1 >= 0.5) {
      numToPrint++;
    }
    System.out.println(numToPrint);
  }

  /*В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
    на экран результат деления q на w с остатком. Пример вывода программы (для случая,
    когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.*/

  public static void task5() {
    int q = 21;
    int w = 8;
    System.out.println("Результат деления без остатка: " + q / w);
    System.out.println("С остатком: " + q % w);
  }

  /*Написать программу которая будет менять местами значение целочисленных
    переменных. Пример:
    int a = 1; int b = 2;
    //код (ваше решение)
    sout(a); //выведет 2
    sout(b); //выведет 1
    Усовершенствовать программу, использовать только 2 входные переменные (a,b);*/

  public static void task6(int a, int b) {
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a: " + a);
    System.out.println("b: " + b);
  }
}
