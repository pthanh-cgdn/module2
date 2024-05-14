package session6_inheritance;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public double getArea(){
        double p = (this.side1+this.side2+this.side3)/2;
        return Math.pow(p*(p-this.side1)*(p-this.side2)*(p-this.side3),0.5);
    }
    public double getPerimeter(){
        return  this.side1+this.side2+this.side3;
    }
    public String toString(){
        return "A triangle with three sides: "+this.side1+", "+this.side2+", "+this.side3+".";
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.toString());
        System.out.println("The Areas of this Triagle is: "+triangle.getArea());
    }
}
