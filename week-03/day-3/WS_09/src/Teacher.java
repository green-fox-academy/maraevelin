public class Teacher {
  public Teacher() {

  }
  public void answer() {

  }
  public void teach(Student student) {
    student.learn();
  }

  public static void main(String[] args) {
    Student student = new Student();
    Teacher teacher = new Teacher();

  }
}