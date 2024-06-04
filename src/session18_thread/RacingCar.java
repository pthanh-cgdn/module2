package session18_thread;

import java.util.Random;

public class RacingCar implements Runnable{
    // Khai báo Tên của xe đua
    private String name;

    public RacingCar(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Khởi tạo điểm start (hay km ban đầu)
        int runDistance = 0;
        // Khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();
        // Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < Main.DISTANCE) {
            try {
                // Random tốc độ KM/H
                int speed = (new Random()).nextInt(20);
                // Tính toán khoảng cách đã đi được
                runDistance += speed;
                // Vẽ đường đã đi của xe
                String log = "|";
                int percentTravel = (runDistance * 100) / Main.DISTANCE;
                for (int i = 0; i < Main.DISTANCE; i += Main.STEP) {
                    if (percentTravel >= i + Main.STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(Main.DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
class Main{
    public static int DISTANCE = 100;
    public static int STEP = 10;

    public static void main(String[] args) {
        RacingCar CarA = new RacingCar("CarA");
        RacingCar CarB = new RacingCar("CarB");
        RacingCar CarC = new RacingCar("CarC");

        Thread thread1 = new Thread(CarA);
        Thread thread2 = new Thread(CarB);
        Thread thread3 = new Thread(CarC);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
