package session6_inheritance;

public class RectangleS extends Shape {
    private double width;
    private double height;

    public RectangleS() {
        this.width = 1;
        this.height = 1;
    }

    public RectangleS(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectangleS(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public String toString() {
        return "A Rectangle with width=" + this.width + " and length=" + this.height + ", which is a subclass of " + super.toString();
    }
}
