import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Fifth
{
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("data1.txt ");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("data2.txt ");
        BufferedWriter bw = new BufferedWriter(fw);

        String line;

        while((line = br.readLine()) != null) {
            String[] words = line.split("\\W+");
            for(String w : words) {
                bw.write(w);
                bw.newLine();
            }
        }

        bw.close();
    }
}
