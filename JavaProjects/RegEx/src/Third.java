import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Third {
    public static void main(String args[]) {
        String input = "the string pattern[12345]pattern stu[67890]stu";
//        String regex = "(?<=\\[).*?(?=\\])";
        String regex = "(?<=[a-zA-Z]\\[)(.*?)(?=\\][a-zA-Z].*])";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(input);
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
