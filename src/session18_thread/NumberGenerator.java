package session18_thread;

public class NumberGenerator implements Runnable {
    private String name;
    public NumberGenerator(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name+": "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator("Thread1");
        NumberGenerator num2 = new NumberGenerator("Thread2");
        Thread t1 = new Thread(num1);
        Thread t2 = new Thread(num2);
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
