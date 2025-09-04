package lesson7.hospital;

public class Dentist extends Doctor {
  public Dentist() {
    this("Андрюха", 69, "дантист", 5);
  }

  public Dentist(String name, int age, String post, int lengthOfService) {
    setName(name);
    setAge(age);
    setPost(post);
    setLengthOfService(lengthOfService);
  }

  @Override
  public void treatPatient() {
    System.out.println("Луплю с ноги в рот!");
  }

  @Override
  public int getAdvise(Patient patient) {
    System.out.println(patient.getName() + " чисти зубы чаще чем раз в год!");
    return 0;
  }
}
