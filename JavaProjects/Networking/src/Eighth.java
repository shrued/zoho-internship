import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Eighth {
    public static void main(String[] args) {
        Properties prop = new Properties();
        Map map = new HashMap<>();
        try {
            FileInputStream inputStream = new FileInputStream("Properties.properties");
            prop.load(inputStream);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        for (final Map.Entry<Object, Object> entry : prop.entrySet()) {
            map.put((String) entry.getKey(), (String) entry.getValue());
        }
        System.out.println(map.entrySet());
    }
}
