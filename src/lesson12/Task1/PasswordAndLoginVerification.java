package lesson12.Task1;

public abstract class PasswordAndLoginVerification {

  public static boolean startVerification(String login,
                                          String password,
                                          String confirmPassword) {
    try {
      if (login.matches("\\S{3,19}")) {
        System.out.println("Логин введен верно!");
      } else {
        throw new WrongLoginException();
      }
      if (password.matches("(?=\\S*\\d)\\S{3,19}") && password.equals(confirmPassword)) {
        System.out.println("Пароль введен верно!");
      } else {
        throw new WrongPasswordException();
      }

    } catch (WrongLoginException | WrongPasswordException e) {
      System.out.println("Все похерилось: ");
      e.printStackTrace();
      return false;
    }
    return true;
  }
}
