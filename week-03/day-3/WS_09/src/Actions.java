public class Actions {
  Student student = new Student();
  Teacher teacher = new Teacher();

  public void question(Teacher teacher) {
    teacher.answer();
  }

  public void teach(Student student) {
    student.learn();
  }

}
