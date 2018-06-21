import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckStuff {

  public static void main(String[] args) {
    String[] stuff = new String[] {"-", "r", " ", "2", "8"};
    String newStuff = "";

    for (int i = 0; i < stuff.length; i++) {
      newStuff += stuff[i];
    }

    System.out.println(stuff.length);
    System.out.println(newStuff);

    System.out.println(newStuff.substring(3));
    Integer argument = Integer.valueOf(newStuff.replace("-r ", ""));

    System.out.println(argument);

    Integer numbi = Integer.valueOf(newStuff.substring(3));
    System.out.println(numbi);
    String newTask = "-a Feed the monkey";

    List<Task> todos = new ArrayList<>();
    todos.add(new Task(1, "Walk the dog"));
    todos.add(new Task(2, "Buy milk"));
    todos.add(new Task(3, "Do homework"));

    if (newTask.equals("-a")) {
      System.out.println("unable to add: no task provided");
    } else {
      todos.add(new Task(todos.size() + 1, newTask.replace("-a ", "")));
    }
    System.out.println(todos.get(todos.size() - 1).description);
  }

}
