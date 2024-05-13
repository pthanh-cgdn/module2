package session4_oop;

import java.util.Scanner;

public class Rectangle {
    double width;
    double height;
    public Rectangle() {

    }
    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * width + 2 * height;
    }
    public String display(){
        return "Rectangle: width=" + width + ", height=" + height;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Perimeter of the Rectangle is "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle is "+ rectangle.getArea());
    }
}
