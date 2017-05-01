import java.io.IOException;
import java.util.Scanner;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

public class YodaApp {
  public static void main(String[] args) {
    System.out.println("Please enter a grammatically correct sentence: ");
    Scanner scanner = new Scanner(System.in);
    String userString = scanner.nextLine();

    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://yoda.p.mashape.com/")
        .build();

    YodaSpeak transformer = retrofit.create(YodaSpeak.class);
    Call<ResponseBody> repos = transformer.getLine(userString);

    try {
      System.out.println(repos.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
