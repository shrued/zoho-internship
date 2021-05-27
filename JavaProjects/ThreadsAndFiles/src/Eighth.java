import java.io.BufferedReader;
import java.io.FileReader;

public class Eighth {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("data1.txt ");
        BufferedReader br = new BufferedReader(fr);

        String line;
        Integer count = 0;

        char[] characters;
        while((line = br.readLine()) != null) {
            characters = line.toCharArray();
            for (int i = 0; i < characters.length; ++i){
                if(characters[i] == 'e') {
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
