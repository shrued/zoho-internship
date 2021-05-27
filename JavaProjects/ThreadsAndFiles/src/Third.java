import java.io.*;

public class Third {
    final static Object lock = new Object();

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                while (true) {
                    synchronized (lock) {
                        FileReader fr = null;
                        FileWriter fw = null;
                        try {
                            File file = new File("text2.txt");
                            fr = new FileReader("text1.txt");
                            fw = new FileWriter(file.getAbsoluteFile(), true);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        BufferedReader br = new BufferedReader(fr);
                        BufferedWriter bw = new BufferedWriter(fw);

                        String line;
                        String threadName = Thread.currentThread().getName();
                        try {
                            while ((line = br.readLine()) != null) {
                                bw.write(line + threadName);
                                bw.newLine();
                                lock.notify();
                            }
                            try {
                                Thread.sleep(1000);
                                lock.wait();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            br.close();
                            bw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.setName(" thread1");

        Thread thread2 = new Thread(runnable);
        thread2.setName(" thread2");

        thread1.start();
        thread2.start();
    }
}
