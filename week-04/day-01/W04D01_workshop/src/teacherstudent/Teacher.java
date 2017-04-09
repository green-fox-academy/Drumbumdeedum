package teacherstudent;

public class Teacher {

  public void teach (Student student) {
    student.learn();
  }

  public void answer () {
    System.out.println("Learn this new thing!");
  }
}
