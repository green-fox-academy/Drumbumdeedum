package blog;

public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public void printBlogPost() {
    System.out.println(title + " titled by " + authorName + " posted at " + publicationDate);
    System.out.println("\t - " + text + "\n");
  }
}
