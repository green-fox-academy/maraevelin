import java.util.ArrayList;
import java.util.List;

public class Cohort {
  private String name;
  private List<Student> students;
  private List<Mentor> mentors;

  public Cohort(String name){
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent() {
    students.add();
  }

  public void addMentor() {
    mentors.add();
  }

}
