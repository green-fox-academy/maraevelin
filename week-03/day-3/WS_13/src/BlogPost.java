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

  public static void main(String[] args) {
    BlogPost blogPost1 = new BlogPost(
        "Lorem Ipsum",
        "John Doe",
        "2000.05.04.",
        "Lorem ipsum dolor sit amet."
    );

    BlogPost blogPost2 = new BlogPost(
        "Wait but why",
        "Tim Urban",
        "2010.10.10.",
        "A popular long-form, stick-figure-illustrated blog about almost everything."
    );

    BlogPost blogPost3 = new BlogPost (
        "One Engineer Is Trying to Get IBM to Reckon With Trump",
        "William Turton",
        "2017.03.28.",
        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing."
    );
  }
}

