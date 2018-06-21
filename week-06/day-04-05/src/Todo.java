import java.util.ArrayList;
import java.util.List;

public class Todo {

  public static void main(String[] args) {
    argumentListener(args);
  }

  private static void argumentListener(String[] args) {
    String argument = convertArgsToString(args);
    List<Task> todos = createTodoList();
    if (args.length == 0) {
      printUsage();
    } else if (argument.contains("-l")) {
      listTasks(todos);
    } else if (argument.contains("-a")) {
      addNewTask(argument, todos);
    }
  }

  private static void addNewTask(String argument, List<Task> todos) {
    if (argument.equals("-a")) {
      System.out.println("unable to add: no task provided");
    } else {
      todos.add(new Task(todos.size() + 1, argument.replace("-a ", "")));
    }
  }

  private static void listTasks(List<Task> todos) {
    if (todos.size() == 0) {
      System.out.println("nothing for today! :)");
    } else {
      for (int i = 0; i < todos.size() ; i++) {
        System.out.println(todos.get(i).id + " -  [" + checkTaskStatus(todos.get(i).isComplete) + "] " + todos.get(i).description);
      }
    }
  }

  private static String checkTaskStatus(boolean isComplete) {
    if (isComplete = false) {
      return " ";
    } else {
      return "x";
    }
  }

  private static void printUsage() {
    System.out.println("=============================\n" +
        "\n" +
        "Command line arguments:\n" +
        " -l   Lists all the tasks\n" +
        " -a   Adds a new task\n" +
        " -r   Removes a task\n" +
        " -c   Checks a task");
  }

  private static List<Task> createTodoList() {
    List<Task> todos = new ArrayList<>();
    for (int i = 1; i <= 3 ; i++) {
      todos.add(new Task(i, "Walk the dog"));
      todos.add(new Task(i, "Buy milk"));
      todos.add(new Task(i, "Do homework"));
    }
    return todos;
  }

  private static String convertArgsToString(String[] args) {
    String argument = "";
    for (int i = 0; i < args.length; i++) {
      argument += args[i];
    }
    return argument;
  }

}
