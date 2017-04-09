package blog;
import java.util.ArrayList;

public class Blog {
  private ArrayList<BlogPost> postsOnBlog;

  public Blog() {
    postsOnBlog = new ArrayList<>();
  }

  public void addBlogPost(BlogPost post) {
    postsOnBlog.add(post);
  }

  public void removeBlogPost(Integer index) {
    postsOnBlog.remove(index-1);
  }

  public void updateBlogPost(Integer index, BlogPost post) {
    postsOnBlog.remove(index-1);
    postsOnBlog.add(index-1, post);
  }

  public void printAllPosts() {
    for (int i=0; i < postsOnBlog.size(); i++) {
      postsOnBlog.get(i).printBlogPost();
    }
  }
}
