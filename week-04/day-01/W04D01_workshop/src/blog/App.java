package blog;

public class App {

  public static void main(String[] args) {
    BlogPost blogPost1;
    blogPost1 = new BlogPost();
    blogPost1.authorName = "John Doe";
    blogPost1.title = "Lorem Ipsum";
    blogPost1.text = "Lorem ipsum dolor sit amet.";
    blogPost1.publicationDate = "2000.05.04.";

    BlogPost blogPost2;
    blogPost2 = new BlogPost();
    blogPost2.authorName = "Tim Urban";
    blogPost2.title = "Wait but why";
    blogPost2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    blogPost2.publicationDate = "2010.10.10";

    BlogPost blogPost3;
    blogPost3 = new BlogPost();
    blogPost3.authorName = "William Turton";
    blogPost3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    blogPost3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked \nto take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the \nwhole organizer profile thing.";
    blogPost3.publicationDate = "2017.03.28.";

    Blog blog1 = new Blog();

    blog1.addBlogPost(blogPost1);
    blog1.addBlogPost(blogPost2);
    blog1.addBlogPost(blogPost3);

    System.out.println("Print original blog posts: ");
    blog1.printAllPosts();
    System.out.println();

    System.out.println("----------------------------------");
    System.out.println("Remove second blogpost: ");
    blog1.removeBlogPost(2);
    blog1.printAllPosts();
    System.out.println();

    System.out.println("----------------------------------");
    System.out.println("Replace last blogpost with other blogpost: ");
    blog1.updateBlogPost(2, blogPost2);
    blog1.printAllPosts();
  }
}
