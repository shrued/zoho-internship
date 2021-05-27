
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 implements Runnable {
    private String name;

    public Task1(String s) {
        name = s;
    }

    public void run() {
        try {
            URL url1 = new URL("http://www.javatpoint.com/java-tutorial");
            URLConnection conn1 = url1.openConnection();
            InputStream is1 = conn1.getInputStream();

            int i;
            System.out.print(name);
            while((i = is1.read()) != -1){
                System.out.print((char)i);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

class Task2 implements Runnable {
    private String name;

    public Task2(String s) {
        name = s;
    }

    public void run() {
        try {
            URL url1 = new URL("http://www.javatpoint.com/java-tutorial");
            URLConnection conn1 = url1.openConnection();
            InputStream is1 = conn1.getInputStream();

            int i;
            System.out.print(name);
            while((i = is1.read()) != -1){
                System.out.print((char)i);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
public class Second {
    static final int MAX_T = 3;

    public static void main(String[] args) {
        Runnable r1 = new Task1("task 1");
        Runnable r2 = new Task1("task 2");
        Runnable r3 = new Task1("task 3");
        Runnable r4 = new Task1("task 4");
        Runnable r5 = new Task1("task 5");

        Runnable R1 = new Task2("task 1");
        Runnable R2 = new Task2("task 2");
        Runnable R3 = new Task2("task 3");
        Runnable R4 = new Task2("task 4");
        Runnable R5 = new Task2("task 5");

        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        pool.execute(R1);
        pool.execute(R2);
        pool.execute(R3);
        pool.execute(R4);
        pool.execute(R5);

        pool.shutdown();
    }
}
