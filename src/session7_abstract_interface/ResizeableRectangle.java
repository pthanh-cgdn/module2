package session7_abstract_interface;

import session6_inheritance.RectangleS;

public class ResizeableRectangle extends RectangleS implements Resizeable {
    public ResizeableRectangle() {
    }

    public ResizeableRectangle(double width, double height) {
        super(width, height);
    }

    public ResizeableRectangle(double width, double height, String color, boolean filled) {
        super(width, height, color, filled);
    }
    @Override
    public void resize(double percent) {
        setWidth(getWidth()*percent);
        setHeight(getHeight()*percent);
    }
}
