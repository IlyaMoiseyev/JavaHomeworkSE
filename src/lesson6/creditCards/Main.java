package lesson6.creditCards;

/* Задание №1. Напишите программу, которая создает три объекта класса CreditCard у которых
   заданы номер счета и начальная сумма. Тестовый сценарий для проверки: Положите деньги на
   первые две карточки и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.*/

public class Main {
  public static void main(String[] args) {
    CreditCard clientVasiliy = new CreditCard("Vasiliy", 541342, 2431);
    CreditCard clientNikolay = new CreditCard("Nikolay");
    CreditCard clientDefault = new CreditCard();

    clientVasiliy.depositCash(678);
    clientNikolay.depositCash(350);
    clientDefault.withdrawCash(432);

    clientVasiliy.getAllCreditCardInformation();
    clientNikolay.getAllCreditCardInformation();
    clientDefault.getAllCreditCardInformation();
  }
}
