/**
 * Created by danielszalay on 2017. 03. 23..
 */
// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crucial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!

public class UrlFixer {
  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";

    String urlmodified = "0";
    String urlmodified2 = "0";

    urlmodified = url.replace("bots", "odds");
    urlmodified2 = urlmodified.substring(0, 5) + ":" + urlmodified.substring(5, urlmodified.length());

    System.out.println(urlmodified2);
  }
}

