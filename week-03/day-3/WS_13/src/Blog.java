import java.util.ArrayList;
import java.util.List;

public class Blog {
  int limit = 3;
  List<BlogPost> blogList;

  public Blog() {
    this.blogList = new ArrayList<BlogPost>();
  }

  public void add() {
    blogList.add(new BlogPost("title", "authorName", "publicationDate", "text"));
  }

  public void delete(int index) {
    blogList.remove(index);
  }

  public void update(int index, BlogPost blogPost) {
    delete(index);
    add();
  }

  public static void main(String[] args) {
    Blog blog = new Blog();
    List<BlogPost> blogList = new ArrayList<BlogPost>();
    BlogPost post1 = new BlogPost("a", "b", "2018", "d");
    BlogPost post2 = new BlogPost("e", "f", "2016", "g");
    BlogPost post3 = new BlogPost("h", "h", "2014", "i");
    BlogPost post4 = new BlogPost("j", "k", "2010", "l");
    BlogPost post5 = new BlogPost("m", "n", "2008", "o");

    blogList.add(post1);
    blogList.add(post2);
    blogList.add(post3);

    blog.add();
    blog.delete(1);
    blog.update(2, post3);
  }
}