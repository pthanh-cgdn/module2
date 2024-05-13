package session4_oop;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private Date startTime;
    private Date endTime;
    public Date getStartTime() {
        return startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public StopWatch() {
        startTime = new Date();
    }
    public void start(){
        startTime = new Date();
    }
    public void stop(){
        endTime = new Date();
    }
    public double getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        boolean isStarted = false;
        boolean isStopped = false;
        StopWatch AppleWatch = new StopWatch();
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready????");
        isStarted = input.nextBoolean();
        if (isStarted) {
            AppleWatch.start();
            System.out.println("Are you finish????");
            isStopped = input.nextBoolean();
            if (isStopped) {
                AppleWatch.stop();
                System.out.println("Your time is : " + AppleWatch.getElapsedTime());
            }
        }
    }
}
