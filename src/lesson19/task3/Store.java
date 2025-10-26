package lesson19.task3;

public class Store {
  private int countOfProducts;

  public static void storeStartWorking() {
    Store store = new Store();
    new Thread(new Producer(store)).start();
    new Thread(new Consumer(store)).start();
  }

  public synchronized void cellProduct() throws InterruptedException {
    while (countOfProducts < 1) {
      wait();
    }
    countOfProducts--;
    System.out.println("Покупатель приобрел 1 товар!");
    System.out.println("Товаров на складе: " + countOfProducts);
    notify();
  }

  public synchronized void getProductFromProducer() throws InterruptedException {
    while (countOfProducts >= 3) {
      wait();
    }
    countOfProducts++;
    System.out.println("Производитель доставил на склад 1 товар!");
    System.out.println("Товаров на складе: " + countOfProducts);
    notify();
  }
}
