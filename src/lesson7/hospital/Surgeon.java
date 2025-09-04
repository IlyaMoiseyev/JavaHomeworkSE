package lesson7.hospital;

public class Surgeon extends Doctor {

  public Surgeon() {
    this("Василий", 39, "хирург", 15);
  }

  public Surgeon(String name, int age, String post, int lengthOfService) {
    setName(name);
    setAge(age);
    setPost(post);
    setLengthOfService(lengthOfService);
  }

  @Override
  public void treatPatient() {
    System.out.println("ОТРЕЗАЮ НОГИ!!!!");
  }

  @Override
  public int getAdvise(Patient patient) {
    System.out.println(patient.getName() + " не падай так больше!");
    return 0;
  }
}
