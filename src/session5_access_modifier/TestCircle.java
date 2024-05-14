package session5_access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}