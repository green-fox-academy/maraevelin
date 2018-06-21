import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TodoApp {

  public static void main(String[] args) {
    argsHandler(args);
  }

  private static void argsHandler(String[] args) {
    if (args.length == 0){
      printUsage();
    } else if (args.equals("-l")){
      listTasks(args);
    } else if (args.equals("-a \"Feed the monkey\"")){
      addNewTask(args);
    }
  }

  private static void addNewTask(String[] args) {
    if (args.equals("-a")) {
      System.out.println("Unable to add: no task provided");
    } else {
      String newTask = args.toString().replace("-a ", "");
      getTasksFromTodoFile().add(newTask);
    }
  }

  private static void listTasks(String[] args) {
    List<String> tasks = getTasksFromTodoFile();
    if (tasks.size() == 0) {
      System.out.println("No todos for today! :)");
    } else {
      for (int i = 0; i < tasks.size(); i++) {
        System.out.println((i++) + " - " + tasks.get(i));
      }
    }
  }

  private static List<String> getTasksFromTodoFile() {
    try {
      return Files.readAllLines(Paths.get("tasks_to_do.txt"));
    } catch (IOException e) {
      return null;
    }
  }

  private static void printUsage() {
    System.out.println("Command Line Todo application\n" +
        "=============================\n\n" +
        "Command line arguments:\n" +
        "-l   Lists all the tasks\n" +
        "-a   Adds a new task\n" +
        "-r   Removes a task\n" +
        "-c   Completes a task");
  }

}