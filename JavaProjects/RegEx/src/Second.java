import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Second {
    public static void main(String args[]) {
        String input = "Removing  unwanted    spaces using  Regex";
        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String result = matcher.replaceAll(" ");
        System.out.print(result);
    }
}