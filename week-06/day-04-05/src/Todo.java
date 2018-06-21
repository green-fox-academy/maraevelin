import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Todo {
  int id;
  String description;
  boolean isDone;

  Todo() {

  }

  public static void main(String[] args) {
    argumentListener(args);
  }

  private static void argumentListener(String[] args) {
    List<String> todos = getTodosFromFile();
    int todoAmount = getTodoAmount(todos);
    if (args.length == 0) {
      printUsage();
    } else if (args.toString().contains("-l")) {
      listTasks(todos);
    } else if () {

    } else if () {

    }
  }



  private static void listTasks(List<String> todos) {

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

  private static int getTodoAmount(List<String> todos) {
    int todoAmount = 0;
    for (String row : todos) {
      todoAmount++;
    }
    return todoAmount;
  }

  private static List<String> getTodosFromFile() {
    try {
      return Files.readAllLines(Paths.get("todo.txt"));
    } catch (IOException e) {
      return null;
    }
  }

}
