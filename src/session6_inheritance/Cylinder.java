package session6_inheritance;

public class Cylinder extends CircleS{
    private double height;

    public Cylinder() {
        this.height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return super.getArea()*2+super.getPerimeter()*Math.PI*this.height;
    }
    public double getVolume() {
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A cyclinder wi;th height " + height + " and area " + getArea() + " and volume " + getVolume();
    }
}
