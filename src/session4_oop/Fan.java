package session4_oop;

import java.util.Scanner;

public class Fan {
    public static final byte SLOW = 1;
    public static final byte MEDIUM = 2;
    public static final byte FAST = 3;
    private byte speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    public byte getSpeed() {
        return this.speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public Fan() {

    }

    public String toString() {
        if (this.on) {
            return "Fan is on, speed = " + this.speed + ", radius = " + this.radius + ", color = " + this.color;
        } else {
            return "Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        Scanner input = new Scanner(System.in);
        System.out.println("Turn fan on???");
        fan.setOn(input.nextBoolean());
        System.out.println("Enter the speed: ");
        fan.setSpeed(input.nextByte());
        System.out.println("Enter the radius of the fan: ");
        fan.setRadius(input.nextDouble());
        System.out.println("Enter the color of the fan: ");
        fan.setColor(input.next());
        System.out.println(fan.toString());
    }
}