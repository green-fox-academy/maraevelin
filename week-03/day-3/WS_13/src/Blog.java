import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> blogList;

  public Blog() {
    this.blogList = new ArrayList<BlogPost>();
  }

  public void delete(int index) {
    blogList.remove(index);
  }

  public void update(int index, BlogPost blogPost) {
    delete(index-1);
    blogList.add(index-1, blogPost);
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
    blogList.add(post4);
    blogList.add(post5);

    blog.blogList = blogList;

    blog.delete(4);
    blog.update(4, post1);

  }
}