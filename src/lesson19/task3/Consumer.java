package lesson19.task3;

public record Consumer(Store store) implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i <= 5; i++) {
      try {
        store.cellProduct();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
