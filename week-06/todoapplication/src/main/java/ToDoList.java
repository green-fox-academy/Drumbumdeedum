import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {

  private String fileName;
  public ArrayList<ToDo> listOfToDos;

  public ToDoList(String fileName) {
    listOfToDos = new ArrayList<>();
    this.fileName = fileName;
    loadList();
  }

  public void addTodo(String todo) {
    this.listOfToDos.add(new ToDo(todo, false, listOfToDos.get(listOfToDos.size()-1).getID()+1));
  }

  public void removeTodo(int index) {
    for (int i=0; i < listOfToDos.size(); i++) {
      if (listOfToDos.get(i).getID() == index) {
        listOfToDos.remove(i);
      }
    }
  }

  public void checkTodo(int index) {
    for (int i=0; i < listOfToDos.size(); i++) {
      if (listOfToDos.get(i).getID() == index) {
        listOfToDos.get(i).setCompleted();
        listOfToDos.get(i).setCompletedAt();
      }
    }
  }

  public void updateTodo(int index, String text) {
    for (int i=0; i < listOfToDos.size(); i++) {
      if (listOfToDos.get(i).getID() == index) {
        listOfToDos.get(i).setTodoText(text);
      }
    }
  }

  public void listToDos() {
    ArrayList<String[]> printToDoLines = new ArrayList<>();
    try {
      for (String line : Files.readAllLines(Paths.get(fileName))) {
        String[] splitData = line.split(";");
        printToDoLines.add(splitData);
      }
    } catch (Exception e) {

    }

    for (String[] todoLine : printToDoLines) {
      String ID  = todoLine[0] + " ";
      String completionStatus = todoLine[1].equals("FALSE") ? "[ ] ": "[X] ";
      String text = todoLine[2] + " ";
      String createdAt = "\t To-Do created on: " + todoLine[3] + " ";
      String completedAt = todoLine[1].equals("FALSE") ? "ToDo not completed yet" : "completed on: " + todoLine[4];
      System.out.println("#ID: " + ID + completionStatus + text + createdAt + completedAt);

    }
  }

  public void loadList() {
    try {
      for (String line : Files.readAllLines(Paths.get(fileName))) {
        listOfToDos.add(new ToDo(line));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void saveList() {
    List<String> lines = new ArrayList<>();
    for (int i=0; i < listOfToDos.size(); i++) {
      lines.add(listOfToDos.get(i).convertToCSV());
    }
    try {
      Files.write(Paths.get(fileName), lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
