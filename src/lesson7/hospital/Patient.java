package lesson7.hospital;

public class Patient {
  private String name;
  private int age;
  private int diseaseNumber;

  public Patient() {
    this("Санек", 86, 1);
  }

  public Patient(String name, int age, int diseaseNumber) {
    setName(name);
    setAge(age);
    setDiseaseNumber(diseaseNumber);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getDiseaseNumber() {
    return diseaseNumber;
  }

  public void setDiseaseNumber(int diseaseNumber) {
    this.diseaseNumber = diseaseNumber;
  }

  public void showAllPatientInformation() {
    System.out.println("------------------");
    System.out.println("Пациент: " + getName());
    System.out.println("Мне " + getAge() + " лет, мане кажется номер моего заболевания " + getDiseaseNumber());
    System.out.println("------------------");
  }
}
