package session8_clean_code;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        return getBaseArea(radius) * height;
    }

    public static double getArea(int radius, int height) {
        return 2 * getBaseArea(radius) + getPerimeter(radius) * height;
    }

    private static double getPerimeter(int radius) {
        return 2 * radius * Math.PI;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

}
