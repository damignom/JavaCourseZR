package intensive.Homework4;

public class DeadlockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args){
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Hold lock 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) { }
                System.out.println("Wait for lock 2...");
                synchronized (lock2){
                    System.out.println("t1 Hold lock 1/2");
                }
            }
        });


        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Hold lock 2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) { }
                System.out.println("Wait for lock 1...");
                synchronized (lock2){
                    System.out.println("t2 Hold lock 1/2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
