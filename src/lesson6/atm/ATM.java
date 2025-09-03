package lesson6.atm;
import java.util.Random;
import java.util.Scanner;

/* Задача №2*. Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
   задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
   метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
   принимает сумму денег, а возвращает булевое значение - успешность выполнения
   операции. При снятии денег, функция должна распечатывать каким количеством купюр
   какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
   количеством купюр каждого номинала. */

public class ATM {
  private int quantityTwentyDollarBills;
  private int quantityFiftyDollarBills;
  private int quantityHundredDollarBills;


  public ATM() {
    this(new Random().nextInt(1, 10),
            new Random().nextInt(1, 10),
            new Random().nextInt(1, 10));
  }

  public ATM(int quantityTwentyDollarBill, int quantityFiftyDollarBill, int quantityHundredDollarBill) {
    setQuantityTwentyDollarBills(quantityTwentyDollarBill);
    setQuantityFiftyDollarBills(quantityFiftyDollarBill);
    setQuantityHundredDollarBills(quantityHundredDollarBill);
  }

  public void setQuantityTwentyDollarBills(int quantityTwentyDollarBills) {
    this.quantityTwentyDollarBills = quantityTwentyDollarBills;
  }

  public void setQuantityFiftyDollarBills(int quantityFiftyDollarBills) {
    this.quantityFiftyDollarBills = quantityFiftyDollarBills;
  }

  public void setQuantityHundredDollarBills(int quantityHundredDollarBills) {
    this.quantityHundredDollarBills = quantityHundredDollarBills;
  }

  public int getQuantityTwentyDollarBills() {
    return quantityTwentyDollarBills;
  }

  public int getQuantityFiftyDollarBills() {
    return quantityFiftyDollarBills;
  }

  public int getQuantityHundredDollarBills() {
    return quantityHundredDollarBills;
  }

  public int getEntireAmountATM() {
    return 20 * getQuantityTwentyDollarBills() +
            50 * getQuantityFiftyDollarBills() +
            100 * getQuantityHundredDollarBills();
  }

  public void depositCashToATM(int amount) {
    if (amount < 20) {
      System.out.println("Внесенная сумма слишком мала!");
      return;
    }

    int tempQuantityHundredDollarBill;
    int tempQuantityFiftyDollarBill;
    int tempQuantityTwentyDollarBill;

    tempQuantityHundredDollarBill = amount / 100;
    amount -= tempQuantityHundredDollarBill * 100;

    tempQuantityFiftyDollarBill = amount / 50;
    amount -= tempQuantityFiftyDollarBill * 50;

    tempQuantityTwentyDollarBill = amount / 20;
    amount -= tempQuantityTwentyDollarBill * 20;

    if (tempQuantityHundredDollarBill > 0) {
      quantityHundredDollarBills += tempQuantityHundredDollarBill;
      System.out.println("Внесено " + tempQuantityHundredDollarBill + " 100$ банкнот/а");
    }

    if (tempQuantityFiftyDollarBill > 0) {
      quantityFiftyDollarBills += tempQuantityFiftyDollarBill;
      System.out.println("Внесено " + tempQuantityFiftyDollarBill + " 50$ банкнот/а");
    }

    if (tempQuantityTwentyDollarBill > 0) {
      quantityTwentyDollarBills += tempQuantityTwentyDollarBill;
      System.out.println("Внесено " + tempQuantityTwentyDollarBill + " 20$ банкнот/а");
    }

    if (amount != 0) {
      System.out.println("Банкомат не зачислил и возвращает " + amount + " $");
    }

  }

  public void depositCashToATM() {
    int typeOfBanknote;
    int numberOfBill;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Пожалуйста введите тип банкноты где:");
    System.out.println("1 - банкнота номиналом 20$");
    System.out.println("2 - банкнота номиналом 50$");
    System.out.println("3 - банкнота номиналом 100$");
    typeOfBanknote = scanner.nextInt();

    System.out.println("Пожалуйста введите количество вносимых банкнот:");
    numberOfBill = scanner.nextInt();

    switch (typeOfBanknote) {
      case 1:
        quantityTwentyDollarBills += numberOfBill;
        if (numberOfBill > 1) {
          System.out.println("Добавлено " + numberOfBill + " 20$ банкнот.");
        } else {
          System.out.println("Добавлена банкнота 20$");
        }
        break;
      case 2:
        quantityFiftyDollarBills += numberOfBill;
        if (numberOfBill > 1) {
          System.out.println("Добавлено " + numberOfBill + " 50$ банкнот.");
        } else {
          System.out.println("Добавлена банкнота 50$");
        }
        break;
      case 3:
        quantityHundredDollarBills += numberOfBill;
        if (numberOfBill > 1) {
          System.out.println("Добавлено " + numberOfBill + " 100$ банкнот.");
        } else {
          System.out.println("Добавлена банкнота 100$");
        }
        break;
      default:
        System.out.println("Доступные номиналы для внесения: 20, 50, 100.");
    }
    scanner.close();
  }

  public void showAmountAtATM() {

    System.out.println("В банкомате имеются банкноты: ");
    System.out.println("20$ : " + quantityTwentyDollarBills + " ед.");
    System.out.println("50$ : " + quantityFiftyDollarBills + " ед.");
    System.out.println("100$ : " + quantityHundredDollarBills + " ед.");
    System.out.println("Суммарно: " + getEntireAmountATM() + " $");
  }

  public boolean cashWithdrawal(int amount) {
    System.out.println("Попытка снять " + amount + " $");
    boolean success = false;
    int tempWithdrawal = amount;
    if (tempWithdrawal < getEntireAmountATM()) {
      int counterOfTwenty = 0;
      int counterOfFifty = 0;
      int counterOfHundred = 0;

      int tempHundreds = tempWithdrawal / 100;
      if (tempHundreds > 0 && tempHundreds > getQuantityHundredDollarBills() && getQuantityHundredDollarBills() > 0) {
        tempHundreds -= getQuantityHundredDollarBills();
        tempWithdrawal -= quantityHundredDollarBills * 100;
        counterOfHundred = quantityHundredDollarBills;
        quantityHundredDollarBills = 0;
      } else {
        tempWithdrawal -= tempHundreds * 100;
        counterOfHundred = tempHundreds;
        quantityHundredDollarBills -= tempHundreds;
      }

      int tempFifty = tempWithdrawal / 50;
      if (tempFifty > 0 && tempFifty > getQuantityFiftyDollarBills() && getQuantityHundredDollarBills() > 0) {
        tempFifty -= getQuantityFiftyDollarBills();
        tempWithdrawal -= tempFifty * 50;
        counterOfFifty = quantityFiftyDollarBills;
        quantityFiftyDollarBills = 0;
      } else {
        tempWithdrawal -= tempFifty * 50;
        counterOfFifty = tempFifty;
        quantityFiftyDollarBills -= tempFifty;
      }

      if (tempWithdrawal > 0) {
        int tempTwenty = tempWithdrawal / 20;
        if (tempTwenty <= getQuantityTwentyDollarBills()) {
          tempWithdrawal -= tempTwenty * 20;
          counterOfTwenty = tempTwenty;
          quantityTwentyDollarBills -= tempTwenty;
        } else {
          System.out.println("Не хватает банкнот для снятия!");
        }
      }

      if (tempWithdrawal == 0) {
        System.out.println("Успех операции!");
        System.out.println("Выдана сумма: " + amount + ". Подробно:");
        System.out.println("Банкнот номиналом 20$: " + counterOfTwenty + " ед.");
        System.out.println("Банкнот номиналом 50$: " + counterOfFifty + " ед.");
        System.out.println("Банкнот номиналом 100$: " + counterOfHundred + " ед.");
        return !success;
      } else {
        System.out.println("Средства которые не удалось снять " + tempWithdrawal);
        return success;
      }
    } else {
      System.out.println("В банкомате отсутствует необходимое количество банкнот!");
      return success;
    }
  }
}
