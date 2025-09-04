package lesson6.atm;

public class Main {
  public static void main(String[] args) {
    ATM atm = new ATM();
    atm.showAmountAtATM();
    atm.depositCashToATM(90);
    atm.showAmountAtATM();
    atm.cashWithdrawal(360);
    atm.showAmountAtATM();
  }
}
