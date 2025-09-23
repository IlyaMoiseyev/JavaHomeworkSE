package lesson12.Task1;

public class WrongLoginException extends Exception {

  public WrongLoginException() {
    this("Введен неверный логин!");
  }

  public WrongLoginException(String message) {
    super(message);
  }
}
