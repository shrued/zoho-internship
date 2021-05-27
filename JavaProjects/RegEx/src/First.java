import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public static void main(String[]args) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("asdf123asdf456sdff");
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}