package lesson19.task3;

public record Producer(Store store) implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i <= 5; i++) {
      try {
        store.getProductFromProducer();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
