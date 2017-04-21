public class Arguments {

  private static final String LIST = "-l";
  private static final String ADD = "-a";
  private static final String REMOVE = "-r";
  private static final String COMPLETE = "-c";
  private static final String UPDATE = "-u";

  private String argument;
  private String command;

  public Arguments(String[] args) {
    if (args.length > 0) {
      if (args.length == 1) {
        this.argument = args[0];
      } else if (((args.length == 2))) {
        this.argument = args[0];
        this.command = args[1];
      }
    }
  }

  public boolean noArguments() {
    return argument == null;
  }

  public boolean isList() {
    return argument.equals(LIST);
  }

  public boolean isAdd() {
    return argument.equals(ADD);
  }

  public boolean isRemove() {
    return argument.equals(REMOVE);
  }

  public boolean isComplete() {
    return argument.equals(COMPLETE);
  }

  public boolean isUpdate() {
    return argument.equals(UPDATE);
  }

  public String getCommand() {
    return command;
  }
}
