import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ToDo {

  private int ID;
  public boolean completed;
  private String todoText;
  private LocalDate createdAt, completedAt;


  public ToDo(String line) {
    convertFromCSV(line);
  }

  public ToDo(String text, boolean completed, int IDnr) {
    ID = IDnr;
    this.completed = completed;
    this.todoText = text;
    createdAt = LocalDate.now();
    completedAt = null;
  }

  public int completionTime() {
    return (int)(ChronoUnit.DAYS.between(this.createdAt, this.completedAt));
  }

  public String getTodoText() {
    return this.todoText.toString();
  }

  public void setTodoText(String input) {
    this.todoText = input;
  }

  public int getID() {
    return this.ID;
  }

  public void setCompleted() {
    this.completed = true;
  }

  public LocalDate getCreatedAt() {
    return this.createdAt;
  }

  public LocalDate getCompletedAt() {
    return this.completedAt;
  }

  public void setCompletedAt() {
    this.completedAt = LocalDate.now();
  }

  public String convertToCSV() {
    String ID = Integer.toString(this.ID);
    String completionStatus = this.completed ? "TRUE" : "FALSE";
    String text = this.getTodoText();
    String createdAt = this.getCreatedAt().toString();
    String completedAt = this.completedAt == null ? "1900-01-01" : this.getCompletedAt().toString();
    return ID + ";" + completionStatus + ";" + text + ";" + createdAt + ";" + completedAt;
  }

  public void convertFromCSV(String csv) {
    String[] items = csv.split(";");
    this.ID = Integer.parseInt(items[0]);
    this.completed = items[1].equals("TRUE") ? true : false;
    this.todoText = items[2];
    this.createdAt = LocalDate.parse(items[3]);
    this.completedAt = LocalDate.parse(items[4]);
  }
}
