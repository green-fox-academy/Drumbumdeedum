public class PostIt {
  String backgroundColor;
  String text;
  String textColor;

  public PostIt(){

  }

  public void createPostIt() {
    System.out.println("Post-it details: ");
    System.out.println("\t - color is: "+backgroundColor);
    System.out.println("\t - text is: "+text);
    System.out.println("\t - text color is: "+textColor);
  }
}

class mainPrinter {

  public static void main(String[] args) {

    PostIt postIt1;
    postIt1 =  new PostIt();
    postIt1.backgroundColor = "orange";
    postIt1.text = "Idea 1";
    postIt1.textColor = "blue";
    postIt1.createPostIt();

    PostIt postIt2;
    postIt2 =  new PostIt();
    postIt2.backgroundColor = "pink";
    postIt2.text = "Awesome!";
    postIt2.textColor = "black";
    postIt2.createPostIt();

    PostIt postIt3;
    postIt3 =  new PostIt();
    postIt3.backgroundColor = "yellow";
    postIt3.text = "Superb!!";
    postIt3.textColor = "green";
    postIt3.createPostIt();
  }
}


