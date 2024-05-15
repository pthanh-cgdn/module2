package session7_abstract_interface;

import session6_inheritance.CircleS;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparator implements Comparator<CircleS> {
    @Override
    public int compare(CircleS c1, CircleS c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        CircleS[] circles = new CircleS[3];
        circles[0] = new CircleS(3.6);
        circles[1] = new CircleS();
        circles[2] = new CircleS(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (CircleS circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (CircleS circle : circles) {
            System.out.println(circle);
        }
    }
}