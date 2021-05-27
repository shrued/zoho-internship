import java.io.*;

public class Second {
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("text.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("First Line");
            bw.newLine();
            bw.write("Second Line");
            bw.newLine();
            bw.write("Third Line");
            bw.newLine();

            bw.close();

            FileReader fr = new FileReader("text.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException Ex) {
            System.out.println(Ex.getMessage());
        }
    }
}
