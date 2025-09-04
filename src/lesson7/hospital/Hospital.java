package lesson7.hospital;

public class Hospital {
  private Doctor therapist;
  private Doctor surgeon;
  private Doctor dentist;

  public void startHospital() {
    System.out.println("Госпиталь открывает свои двери! WELCOME TO HELL!!!");
    therapist = new Therapist("Пантилимон", 65, "терапевт", 30);
    surgeon = new Surgeon("МясникМихаил", 75, "хирург", 40);
    dentist = new Dentist();
  }

  public void acceptThePatient(Patient patient) {
    System.out.println("Поступил пациент! Данные пациента:");
    patient.showAllPatientInformation();
    therapist.getAllInformationAboutDoctor();
    therapist.treatPatient();
    processingTherapistDecision(patient);
  }

  public void processingTherapistDecision(Patient patient) {
    int numberOfDisease = therapist.getAdvise(patient);
    if (numberOfDisease == 1) {
      surgeon.getAllInformationAboutDoctor();
      surgeon.treatPatient();
      surgeon.getAdvise(patient);
    } else {
      dentist.getAllInformationAboutDoctor();
      dentist.treatPatient();
      dentist.getAdvise(patient);
    }
  }
}
