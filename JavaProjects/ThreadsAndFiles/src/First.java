import java.sql.Timestamp;
import java.util.Date;

class Time implements Runnable {
    public void run() {
        try {
            while (true) {
                Date date = new Date();
                Timestamp ts = new Timestamp(date.getTime());
                System.out.println(ts);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class First {
    public static void main(String[] args){
        Time time = new Time();
        Thread thread = new Thread(time);
        thread.start();
    }
}
