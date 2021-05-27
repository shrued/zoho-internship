import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Seventh {
    public static void main(String args[]){
        Document document;
        try {
            document = Jsoup.connect("https://www.github.com").get();

            String title = document.title();

            System.out.println(title);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
