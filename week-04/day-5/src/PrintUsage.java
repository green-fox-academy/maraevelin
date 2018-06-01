public class PrintUsage {
  public static void main(String[] args) {
    System.out.println(printUsage());
  }

  public static String printUsage() {
      return
          "Command Line Todo application \n" +
          "=============================\n" +
          "\n" +
          "Command Line arguments: \n" +
          " -l    List all the tasks \n" +
          " -a    Adds a new task \n" +
          " -r    Removes a task \n" +
          " -c    Completes a task";
  }
}