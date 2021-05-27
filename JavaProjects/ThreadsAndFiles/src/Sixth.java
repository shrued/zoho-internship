import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Sixth {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("data1.txt ");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw1 = new FileWriter("dataE.txt ");
        BufferedWriter bw1 = new BufferedWriter(fw1);

        FileWriter fw2 = new FileWriter("dataO.txt ");
        BufferedWriter bw2 = new BufferedWriter(fw2);

        String line;
        int count;

        while((line = br.readLine()) != null) {
            String[] words = line.split("\\W+");
            count = 0;
            for(String w : words) {
                count = words.length;
            }
            if(count % 2 == 0) {
                bw1.write(line + " " + count);
                bw1.newLine();
            } else {
                bw2.write(line + " " + count);
                bw2.newLine();
            }
        }

        bw1.close();
        bw2.close();
    }
}
