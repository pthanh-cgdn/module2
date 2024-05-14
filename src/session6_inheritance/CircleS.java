package session6_inheritance;

public class CircleS extends Shape{
    private double radius;

    public CircleS() {
        this.radius = 1.0;
    }

    public CircleS(double radius) {
        this.radius = radius;
    }

    public CircleS(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "A Circle with perimeter="+this.getPerimeter()+", which is a subclass of "+super.toString();
    }
}
