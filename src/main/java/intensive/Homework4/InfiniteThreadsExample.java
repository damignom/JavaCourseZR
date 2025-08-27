package intensive.Homework4;

public class InfiniteThreadsExample {
    private static final Object lock = new Object();
    private static volatile boolean isThread1Turn = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (!isThread1Turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {}
                    isThread1Turn = false;
                    lock.notifyAll();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (isThread1Turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {}
                    isThread1Turn = true;
                    lock.notifyAll();
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
