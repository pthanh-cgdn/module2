package session18_thread;

public class OddsThread implements Runnable{
    public OddsThread(){
        System.out.println("Print odds numbers");
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i += 2) {
                System.out.println(i);
                Thread.sleep(10);
            }
        }catch(InterruptedException e){
            System.out.println("OddsThread interrupted");
        }
    }
}
class EvenThread implements Runnable{
    public EvenThread(){
        System.out.println("Print even numbers");
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i += 2) {
                System.out.println(i);
                Thread.sleep(10);
            }
        }catch(InterruptedException e){
            System.out.println("EvenThread interrupted");
        }
    }
}
class Main3{
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddsThread odd =  new OddsThread();
        Thread thread1 = new Thread(even);
        Thread thread2 = new Thread(odd);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Main3 interrupted");
        }
        thread2.start();
    }
}