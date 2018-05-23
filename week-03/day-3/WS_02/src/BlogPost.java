public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost(String title, String authorName, String publicationDate, String text) {

    this.title = title;
    this.authorName = authorName;
    this.publicationDate = publicationDate;
    this.text = text;
    System.out.println("\"" + title + "\"" +
        " titled by " + authorName +
        " posted at " + "\"" + publicationDate + "\"" +
        "\n" + "  " + text + "\n");
  }

}
