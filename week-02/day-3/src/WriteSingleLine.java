import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    List<String> contentIsMyName = new ArrayList<>();
    contentIsMyName.add("Mára Evelin");

    try {
      Path filePath = Paths.get("./my-file.txt");
      Files.write(filePath, contentIsMyName);
      System.out.println("The content was added to my-file.txt");
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }

  }
}
