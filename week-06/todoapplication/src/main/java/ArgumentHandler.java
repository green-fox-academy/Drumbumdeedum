public class ArgumentHandler {

  public void handleArguments(String[] args) {

    Arguments argument = new Arguments(args);
    ToDoList todoList = new ToDoList("todo.txt");

    if (argument.noArguments()) {
      printUsageInformation();
    } else if (argument.isList()) {
      todoList.listToDos();
    } else if (argument.isAdd()) {
      todoList.addTodo(argument.getCommand());
    } else if (argument.isRemove()) {
      todoList.removeTodo(Integer.parseInt(argument.getCommand())-1);
    } else if (argument.isComplete()) {
      todoList.checkTodo(Integer.parseInt(argument.getCommand())-1);
    } else if (argument.isUpdate()) {
      System.out.println("update"); // work in progress
    } else {
      System.out.println("No such command");
      printUsageInformation();
    }
    todoList.saveList();
  }

  public void printUsageInformation() {
    System.out.println(
      "\n" +
      "*****************************\n" +
      "* Java Todo application     *\n" +
      "* =====================     *\n" +
      "*                           *\n" +
      "* Command line arguments:   *\n" +
      "*  -l   Lists all the tasks *\n" +
      "*  -a   Adds a new task     *\n" +
      "*  -r   Removes a task      *\n" +
      "*  -c   Completes a task    *\n" +
      "*  -u   updates a task      *\n" +
      "*****************************\n" +
      "\n"
    );
  }
}
