import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ToDo {

  private String todo;
  public boolean completed;
  private int ID;
  private LocalDate createdAt, completedAt;


  public ToDo(String text) {
    this.todo = text;
    completed = false;
    createdAt = LocalDate.now();
    completedAt = completedAt;
  }

  public int completionTime() {
    return (int)(ChronoUnit.DAYS.between(this.createdAt, this.completedAt));
  }

  public String getTodo() {
    return this.todo.toString();
  }

  public void setTodo(String input) {
    this.todo = input;
  }

  public int getID() {
    return this.ID;
  }

  public boolean getCompleted() {
    return this.completed;
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
}
