import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class App {
  
  public static void main(String[] args) {
    String[] arg = {"-y", "2000", "-f", "otos.csv", "-o", "greenfox.csv"};

    App newApp = new App(arg);
  }

  public App(String[] arguments) {
    OptionParser parser = new OptionParser();
    parser.accepts("y").withRequiredArg();
    parser.accepts("f").withRequiredArg();
    parser.accepts("o").withRequiredArg();
    OptionSet options = parser.parse(arguments);

    if (!options.has("y")) {
      System.out.println("Year was not given for filtering");
      return;
    }
    String yearFilter = options.valueOf("y").toString();
    String inputFile = (options.has("f"))? options.valueOf("f").toString() : "otos.csv";
    String outputFile = (options.has("o"))? options.valueOf("o").toString() : "output.csv";

    try {
      CSVReader reader = new CSVReader(new FileReader(inputFile), ';');
      List<String[]> lines = reader.readAll();
      CSVWriter writer = new CSVWriter(new FileWriter(outputFile), ';', CSVWriter.NO_QUOTE_CHARACTER);

      for (String[] line : lines) {
        if (line[0].equals(yearFilter)) {
          writer.writeNext(line);
        }
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
