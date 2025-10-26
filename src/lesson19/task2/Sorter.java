package lesson19.task2;

public record Sorter(Sortable sortMethod, int[] array) implements Runnable {
  @Override
  public void run() {
    sortMethod.sort(array);
  }
}
