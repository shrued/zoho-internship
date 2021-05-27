import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class First {
    public static void main(String[] args){
        try{
            URL url1 = new URL("https://github.com");
            URLConnection conn1 = url1.openConnection();
            InputStream is1 = conn1.getInputStream();

            URL url2 = new URL("https://netflix.com");
            URLConnection conn2 = url2.openConnection();
            InputStream is2 = conn2.getInputStream();

            int i;
            while((i = is1.read()) != -1){
                System.out.print((char)i);
            }
            while((i = is2.read()) != -1){
                System.out.print((char)i);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}  