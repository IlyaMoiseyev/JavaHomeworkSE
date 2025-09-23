package lesson12.Task1;

public class WrongPasswordException extends Exception {

  public WrongPasswordException() {
    this("Неверный пароль!");
  }

  public WrongPasswordException(String message) {
    super(message);
  }
}
