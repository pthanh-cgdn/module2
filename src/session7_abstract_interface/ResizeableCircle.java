package session7_abstract_interface;

import session6_inheritance.CircleS;

public class ResizeableCircle extends CircleS implements Resizeable {
    public ResizeableCircle() {

    }

    public ResizeableCircle(double radius) {
        super(radius);
    }

    public ResizeableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    public void resize(double percent) {
        setRadius(getRadius()* percent);
    }

    public static void main(String[] args) {
        ResizeableCircle circle = new ResizeableCircle(10);
        System.out.println(circle.toString());
        System.out.println("Circle after resize:");
        circle.resize(0.5);
        System.out.println(circle.toString());
    }
}
