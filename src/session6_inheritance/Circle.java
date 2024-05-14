package session6_inheritance;

public class Circle extends Geometric {
    private double radius;
    protected String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = super.getColor() + " " + color;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        this.setColor(color);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The " + this.color + " circle is created with the radius is " + radius);
    }

    class Main {
        public static void main(String[] args) {
            Circle circle = new Circle(5, "red", "yellow");
            System.out.println(circle.getColor());
            circle.printCircle();
        }
    }
}
