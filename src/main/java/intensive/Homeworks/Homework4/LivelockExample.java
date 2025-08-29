package intensive.Homeworks.Homework4;

public class LivelockExample {
    static final Object lock = new Object();
    static volatile boolean isThread1Turn = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                if (isThread1Turn) {
                    synchronized (lock) {
                        System.out.println("Thread 1 work");
                        isThread1Turn = false;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {}
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                if (!isThread1Turn) {
                    synchronized (lock) {
                        System.out.println("Thread 2 work");
                        isThread1Turn = true;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {}
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}