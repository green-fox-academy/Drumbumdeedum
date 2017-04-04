package GreenFox;
import java.util.ArrayList;
import java.util.List;

public class LagopusClass {
  String className;
  List students;
  List mentors;

  public LagopusClass (String classname) {
    this.className = classname;
    students = new ArrayList<String>();
    mentors = new ArrayList<String>();
  }

  public void addStudent (Student student) {
    students.add(student);
  }

  public void addMentor (Mentor mentor) {
    mentors.add(mentor);
  }

  public void info () {
    System.out.println("Lagopus " + className + " class has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
}
