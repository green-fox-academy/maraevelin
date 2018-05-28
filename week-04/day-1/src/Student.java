public class Student extends Person{
  public String previousOrganization;
  public int skippedDays;

  public void skipDays(int numberOfDays){
    skippedDays += numberOfDays;

  }

  public void introduce(){
    System.out.println(
        "Hi, I'm " + name + ", a " + age +
            " year old " + gender + " from " + previousOrganization +
            " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal(){
    System.out.println("Be a junior software developer");
  }

  public Student(){
  }


  public Student(String name, int age, String gender, String previousOrganization){
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    previousOrganization = "The School Of Life";
    skippedDays = 0;

  }

}