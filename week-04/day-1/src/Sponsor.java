public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public void hire(){
    hiredStudents ++;
  }

  public void introduce(){
    System.out.println(
        "Hi, I'm " + name + ", a " + age + " year old " + gender +
            " who represents " + company + " and hired " + hiredStudents +" students so far."
    );
  }

  public void getGoal(){
    System.out.println("Hire brilliant junior software developers");
  }

  public Sponsor(){
    company = "Google";
    hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company){
    super(name, age, gender);
    this.company = company;
    }

}
