package session18_thread;

public class Count implements Runnable {
    private Thread myThread;
    public Count() {
        myThread = new Thread(this,"My runnable thread");
        System.out.println("My Thread is created" + myThread);
        myThread.start();
    }
    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Print the count " + i);

                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            }
        System.out.println("Thread exit");
    }
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}
