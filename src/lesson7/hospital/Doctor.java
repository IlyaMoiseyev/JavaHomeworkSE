package lesson7.hospital;

public abstract class Doctor {
  private String name;
  private int age;
  private String post;
  private int lengthOfService;

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

  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }

  public int getLengthOfService() {
    return lengthOfService;
  }

  public void setLengthOfService(int lengthOfService) {
    this.lengthOfService = lengthOfService;
  }

  public void getAllInformationAboutDoctor() {
    System.out.println("----------------------------");
    System.out.println("Меня зовут " + getName());
    System.out.println("Я " + getPost());
    System.out.println("Мне " + getAge() + " лет, в этой профессии уже " + getLengthOfService() + " лет.");
    System.out.println("----------------------------");
  }

  public void treatPatient() {
    System.out.println("Я стажер, обратитесь в регистратуру и запишитесь к доктору!");
  }

  public abstract int getAdvise(Patient patient);
}
