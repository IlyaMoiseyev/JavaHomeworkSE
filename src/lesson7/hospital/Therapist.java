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
    System.out.println("Сынок, я вылечу тебя сам, пара уаров палкой и ты здоров!");
  }

  public int getAdvise(Patient patient) {
    System.out.println("Провожу осмотр, определяю код заболевания...");
    int disease = patient.getDiseaseNumber();
    switch (disease) {
      case 1 -> System.out.println("Направляю " + patient.getName() + " к хирургу!");
      case 2 -> System.out.println("Направляю " + patient.getName() + " к дантисту!");
      case 3 -> treatPatient();
    }
    return disease;
  }
}
