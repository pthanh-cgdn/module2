package session7_abstract_interface;

import session6_inheritance.Square;

public class ResizeableSquare extends Square implements Resizeable {
    public ResizeableSquare() {
    }

    public ResizeableSquare(double side) {
        super(side);
    }

    public ResizeableSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }
    @Override
    public void resize(double percent) {
        setSide(getSide()*percent);
    }
}
