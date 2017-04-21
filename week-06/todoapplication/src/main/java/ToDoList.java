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
    this.listOfToDos.add(new ToDo(todo));
  }

  public void removeTodo(int index) {
    this.listOfToDos.remove(index);
  }

  public void checkTodo(int index) {
    this.listOfToDos.get(index).completed = true;
  }

  public void listToDos() {
    for (int i=0; i < listOfToDos.size(); i++) {
      if (this.listOfToDos.get(i).getCompleted()) {
        System.out.println(Integer.toString(i+1) + " - " + "[X]" + listOfToDos.get(i).getTodo());
      } else {
        System.out.println(Integer.toString(i+1) + " - " + "[ ]" + listOfToDos.get(i).getTodo());
      }
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
      lines.add(listOfToDos.get(i).getTodo());
    }
    try {
      Files.write(Paths.get(fileName), lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
