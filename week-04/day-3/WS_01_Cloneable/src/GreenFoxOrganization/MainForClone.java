package GreenFoxOrganization;

public class MainForClone {
  public static void main(String[] args) {
    Student student = new Student("John", 20, "male", "BME");
    Student student2 = student.getClone();

    student2.introduce();
  }
}
