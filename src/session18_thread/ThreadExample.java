package session18_thread;

public class ThreadExample extends Thread {
    private String name;
    PrintName printname;

    public ThreadExample(String name, PrintName printname) {
        this.name = name;
        this.printname = printname;
    }

      public void run() {
        printname.printName(name);
    }
}
class PrintName{
    synchronized void printName(String name){
        System.out.print("Hello: ");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println(name);
    }
}

class Main2 {
    public static void main(String args[]) {
        PrintName printName = new PrintName();
        ThreadExample thread = new ThreadExample("Thanh",printName);
        ThreadExample thread2 = new ThreadExample("Dung",printName);
        thread.start();
        thread2.start();
    }
}
