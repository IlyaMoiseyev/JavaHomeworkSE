package lesson2;
import java.util.Scanner;

/* Задача №2 из методички. Для введенного числа t (температура на улице) вывести: Если t>–5,
   то вывести «Warm». Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».*/

public class WarmOrCold {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter outdoor temperature value: ");
    int outdoorTemperature = scanner.nextInt();

    if (outdoorTemperature > -5) {
      System.out.println("Warm");
    } else if (outdoorTemperature >= -20) {
      System.out.println("Normal");
    } else {
      System.out.println("Cold");
    }
    scanner.close();
  }
}
