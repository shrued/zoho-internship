import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Seventh {
    final static Object lock = new Object();

    private static Thread th1 = new Thread() {
        public void run() {
            File file = new File("text7.txt");
            FileWriter fw = null;
            try {
                fw = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                synchronized (lock) {
                    String[] arr = new String[]{
                            "Mares eat oats",
                            "Does eat oats",
                            "Little lambs eat ivy",
                            "A kid will eat ivy too"
                    };
                    String threadName = Thread.currentThread().getName();
                    for (String s : arr) {
                        bw.write(s + threadName);
                        bw.newLine();
                        System.out.println(s + threadName);
                        lock.notify();
                        try {
                            Thread.sleep(1000);
                            lock.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };

    private static Thread th2 = new Thread() {
        public void run() {
            File file = new File("text7.txt");
            FileWriter fw = null;
            try {
                fw = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                synchronized (lock) {
                    String[] arr = new String[]{
                            "Mares eat oats",
                            "Does eat oats",
                            "Little lambs eat ivy",
                            "A kid will eat ivy too"
                    };
                    String threadName = Thread.currentThread().getName();
                    for (String s : arr) {
                        bw.write(s + threadName);
                        bw.newLine();
                        System.out.println(s + threadName);
                        lock.notify();
                        try {
                            Thread.sleep(1000);
                            lock.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        th1.setName(" Thread 1");
        th2.setName(" Thread 2");
        th1.start();
        th2.start();
    }
}
