package lesson6.creditCards;
import java.util.Random;

/* Задание №1. Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
   метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
   который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
   выводит текущую информацию о карточке. */

public class CreditCard {
  private String cardHolder;
  private int accountNumber;
  private int balance;

  public CreditCard() {
    this("DefaultUser");
  }

  public CreditCard(String cardHolder) {
    this(cardHolder, new Random().nextInt(332, 453493423),new Random().nextInt(10, 1000));
  }

  public CreditCard(String cardHolder, int accountNumber, int balance) {
    setCardHolder(cardHolder);
    setAccountNumber(accountNumber);
    setBalance(balance);
  }

  public void setCardHolder(String cardHolder) {
    this.cardHolder = cardHolder;
  }

  public String getCardHolder() {
    return cardHolder;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }

  public void depositCash(int amount) {
    balance += amount;
    System.out.println(getCardHolder() + ", Ваш счет пополнен на: " + amount + " руб.");
    System.out.println("Текущий баланс счета: " + getBalance() + " руб");
  }

  public void withdrawCash(int amount) {
    if (amount <= balance) {
      balance -= amount;
      System.out.println(getCardHolder() + ", c Вашего счета списано " + amount + " руб.");
      System.out.println("Текущий баланс счета: " + getBalance() + " руб");
    } else {
      System.out.println(getCardHolder() + " на Вашем счете недостаточно средств!");
    }
  }

  public void getAllCreditCardInformation() {
    System.out.println("----------------------------------");
    System.out.println("Владелец карты: " + getCardHolder());
    System.out.println("Номер счета: " + getAccountNumber());
    System.out.println("Текущий баланс счета: " + getBalance());
    System.out.println("----------------------------------");
  }
}
