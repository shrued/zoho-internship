public class Temp {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            private int counter = 0;

            public void run() {
                while (true) {
                    synchronized (this) {
                        String threadName = Thread.currentThread().getName();

                        counter++;
                        System.out.println(threadName + ", value: " + counter);

                        counter--;
                        System.out.println(threadName + ", value: " + counter);
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
        };

        Thread threadA = new Thread(runnable);
        threadA.setName("Thread A");
        threadA.setDaemon(false);

        Thread threadB = new Thread(runnable);
        threadB.setName("Thread B");
        threadB.setDaemon(false);

        threadA.start();
        threadB.start();
    }
}
