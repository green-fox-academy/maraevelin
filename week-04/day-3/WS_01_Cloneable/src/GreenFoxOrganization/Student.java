package GreenFoxOrganization;

public class Student extends Person implements Cloneable{
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {

    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;

  }

  public Student() {
    this.previousOrganization = "The School Of Life";
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() +
        " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public Student getClone() {
    try {
      return (Student) super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("Cloning is not allowed");
      return this;
    }
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
}