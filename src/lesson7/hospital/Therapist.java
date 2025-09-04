package lesson7.hospital;

public class Therapist extends Doctor {

  public Therapist() {
    this("Никита", 35, "терапевт", 10);
  }

  public Therapist(String name, int age, String post, int lengthOfService) {
    setName(name);
    setAge(age);
    setPost(post);
    setLengthOfService(lengthOfService);
  }

  @Override
  public void treatPatient() {
    System.out.println("Провожу осмотр, определяю код заболевания...");
  }

  public int getAdvise(Patient patient) {
    int disease = patient.getDiseaseNumber();
    switch (disease) {
      case 1 -> System.out.println("Направляю " + patient.getName() + " к хирургу!");
      case 2 -> System.out.println("Направляю " + patient.getName() + " к дантисту!");
    }
    return disease;
  }
}
